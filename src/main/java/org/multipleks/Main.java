package org.multipleks;

import org.multipleks.IO.MovieJsonLoader;
import org.multipleks.repertuar.Movie;
import org.multipleks.struktura.Cinema;
import org.multipleks.struktura.Hall;
import org.multipleks.struktura.HallFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Inicjalizacja Multipleksu
        List<Movie> movies = MovieJsonLoader.loadJsonMovies("src/main/resources/movieList.json");
        //System.out.println(movies.get(0).getDirector());

        HallFactory hallFactory = new HallFactory();
        List<Hall> halls1 = new ArrayList<>();

        //Multiplex #1
        Hall threeDHall1 = hallFactory.create3DHall(30, 7);
        Hall vipHall1 = hallFactory.createVipHall(10, 5);
        Hall normalHall1 = hallFactory.createNormalHall(30, 7);

        halls1.add(threeDHall1);
        halls1.add(vipHall1);
        halls1.add(normalHall1);

        Cinema cinema1 = new Cinema("Zakopianka", "Kraków", halls1);

        //Multiplex #2
        Hall threeDHall2 = hallFactory.create3DHall(40, 7);
        Hall vipHall2 = hallFactory.createVipHall(10, 5);
        Hall normalHall2 = hallFactory.createNormalHall(40, 7);

        List<Hall> halls2 = new ArrayList<>();

        halls2.add(threeDHall2);
        halls2.add(vipHall2);
        halls2.add(normalHall2);

        Cinema cinema2 = new Cinema("Bonarka", "Kraków", halls2);

        System.out.println(cinema2.getHallsList().get(0).getSeatsPlan().getRowList().get(3).getRowName());
        System.out.println(cinema2.getHallsList().get(0).getSeatsPlan().getRowList().get(3).getSeatsList().size());


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
