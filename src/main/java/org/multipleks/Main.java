package org.multipleks;

import org.multipleks.struktura.Cinema;
import org.multipleks.struktura.Hall;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        HallFactory hallFactory = new HallFactory();
        Hall threedHall = hallFactory.create3DHall(50);
        Hall vipHall = hallFactory.createVipHall(20);

        List<Hall> halls = new ArrayList<>();

        halls.add(threedHall);
        halls.add(vipHall);

        Cinema cinema1 = new Cinema("Zakopianka", "Kraków", halls);

        //MovieLoader movieLoaderCinema1 = new MovieLoader();

        //List<String> movieListCinema1 = movieLoaderCinema1.loadMovies("src/main/resources/movieList.txt");
        //Cinema cinema1 = new Cinema("Super Tarasy", "ul. Akademicka 5", movieListCinema1);
        //Dokończyć ten moduł iO i moduł z rezerwacją i lista seansow

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
