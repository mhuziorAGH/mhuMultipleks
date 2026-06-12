package org.multipleks;

import org.multipleks.IO.MovieJsonLoader;
import org.multipleks.repertuar.Movie;
import org.multipleks.repertuar.Show;
import org.multipleks.rezerwacja.Customer;
import org.multipleks.rezerwacja.RegisteredCustomer;
import org.multipleks.rezerwacja.Ticket;
import org.multipleks.struktura.Cinema;
import org.multipleks.struktura.Hall;
import org.multipleks.struktura.HallFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //możliwość postawienia 1 systemu dla 2 lub więcej kin

        List<Movie> movies = MovieJsonLoader.loadJsonMovies("src/main/resources/movieList.json");

        //Multiplex #1
        HallFactory hallFactory = new HallFactory();
        List<Hall> halls1 = new ArrayList<>();

        //chcemy mieć możliwość obsługi seansów VIP i 3D
        Hall threeDHall1 = hallFactory.create3DHall(30, 7, 30);
        Hall vipHall1 = hallFactory.createVipHall(10, 5, 50);
        Hall normalHall1 = hallFactory.createNormalHall(30, 7, 20);

        halls1.add(threeDHall1);
        halls1.add(vipHall1);
        halls1.add(normalHall1);

        Show show1 = new Show(movies.get(1), threeDHall1, LocalDateTime.of(2026, 6, 15, 18, 0));
        Show show2 = new Show(movies.get(2), vipHall1, LocalDateTime.of(2026, 6, 15, 17, 0));
        Show show3 = new Show(movies.get(0), normalHall1, LocalDateTime.of(2026, 6, 15, 16, 0));
        Show show4 = new Show(movies.get(0), normalHall1, LocalDateTime.of(2026, 6, 10, 12, 0));

        threeDHall1.addShow(show1);
        vipHall1.addShow(show2);
        normalHall1.addShow(show3);
        normalHall1.addShow(show4);


        Cinema cinema1 = new Cinema("Zakopianka", "Kraków", halls1);

        //Multiplex #2
        HallFactory hallFactory2 = new HallFactory();
        List<Hall> halls2 = new ArrayList<>();

        Hall threeDHall2 = hallFactory2.create3DHall(40, 7, 40);
        Hall vipHall2 = hallFactory2.createVipHall(10, 5, 45);
        Hall normalHall2 = hallFactory2.createNormalHall(40, 7, 16);

        halls2.add(threeDHall2);
        halls2.add(vipHall2);
        halls2.add(normalHall2);

        Cinema cinema2 = new Cinema("Bonarka", "Kraków", halls2);
        //itd...

        //Metody do wywołania----------------------------------------------------------------------

        //możliwość rezerwacji miejsc przed seansem
        RegisteredCustomer registeredCustomer = new RegisteredCustomer("Jnowak.gmail.com", "Jan", "Nowak", "jnowaczek123", "1234$#@!" );
        cinema1.getHallsList().get(0).getShowList().get(0).reservePlaces(registeredCustomer,"A12", "A13");

        //chcemy mieć możliwość kupienia biletów z wyprzedzeniem
        List<Ticket> ticket1 = cinema1.getHallsList().get(0).getShowList().get(0).getReservationList().get(0).finalizeReservation();
        //ticket1.get(0).printTicket();

        //możliwość sprawdzenia repertuaru na najbliższy tydzień
        cinema1.printProgramme();

        //chcemy mieć możliwość sprawdzenia swoich biletów
        //registeredCustomer.listTickets();

        //chcemy mieć możliwość zakupu biletów bez konta
        Customer customer = new Customer("test@test.pl", "Janusz", "Testowy");
        List<Ticket> ticket2 = cinema1.getHallsList().get(1).getShowList().get(0).buyTicket("B8");
        //ticket2.get(0).printTicket();


    }
}
