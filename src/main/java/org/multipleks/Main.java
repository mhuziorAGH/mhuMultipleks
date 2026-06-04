package org.multipleks;

import org.multipleks.IO.MovieJsonLoader;
import org.multipleks.repertuar.Movie;
import org.multipleks.struktura.Cinema;
import org.multipleks.struktura.Hall;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        HallFactory hallFactory = new HallFactory();
//        Hall threedHall = hallFactory.create3DHall(50);
//        Hall vipHall = hallFactory.createVipHall(20);
//
//        List<Hall> halls = new ArrayList<>();
//
//        halls.add(threedHall);
//        halls.add(vipHall);
//
//        Cinema cinema1 = new Cinema("Zakopianka", "Kraków", halls);

        List<Movie> movies = MovieJsonLoader.loadJsonMovies("src/main/resources/movieList.json");

        System.out.println(movies.get(0).getDirector());

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
