package org.multipleks;

import org.multipleks.IO.MovieJsonLoader;
import org.multipleks.repertuar.Movie;
import org.multipleks.repertuar.Show;
import org.multipleks.struktura.Cinema;
import org.multipleks.struktura.Hall;
import org.multipleks.struktura.HallFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Inicjalizacja Multipleksu
        List<Movie> movies = MovieJsonLoader.loadJsonMovies("src/main/resources/movieList.json");
        //System.out.println(movies.get(0).getDirector());

        //Multiplex #1
        HallFactory hallFactory = new HallFactory();
        List<Hall> halls1 = new ArrayList<>();

        Hall threeDHall1 = hallFactory.create3DHall(30, 7, 30);
        Hall vipHall1 = hallFactory.createVipHall(10, 5, 50);
        Hall normalHall1 = hallFactory.createNormalHall(30, 7, 20);

        halls1.add(threeDHall1);
        halls1.add(vipHall1);
        halls1.add(normalHall1);

        Show show1 = new Show(movies.get(0), threeDHall1, LocalDateTime.of(2026, 6, 15, 18, 0));
        Show show2 = new Show(movies.get(1), vipHall1, LocalDateTime.of(2026, 6, 15, 17, 0));
        Show show3 = new Show(movies.get(2), normalHall1, LocalDateTime.of(2026, 6, 15, 16, 0));
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

        //Metody do wywołania
        //System.out.println(cinema2.getHallsList().get(0).getSeatsPlan().getRowList().get(3).getRowName());
        //System.out.println(cinema2.getHallsList().get(0).getSeatsPlan().getRowList().get(3).getSeatsList().get(5).getNumber());

        cinema1.printProgramme();


        //... configuration and test data should be inserted here...
        // below you will find sample function executions

//        Screening screening = cinema1.getScreenings()[0];
//        screening.reservePlaces("H34", "H35", "H36"); // seats number given
//        screening.reservePlaces(seat1, seat2, seat3); // other option
//        screening.reservePlaces(customer, "H34", "H35", "H36"); // reservation for registered customer
//        movie1 = cinema1.findMovie("James Bon");
        // ... etc ...
    }
}
