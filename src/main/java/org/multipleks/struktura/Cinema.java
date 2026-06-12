package org.multipleks.struktura;

import org.multipleks.repertuar.Movie;
import org.multipleks.repertuar.Show;

import java.time.LocalDateTime;
import java.util.List;

public class Cinema {

    private String name;
    private String address;
    private List<Hall> hallsList;

    public Cinema(String cinemaName, String address, List<Hall> hallsList) {
        this.name = cinemaName;
        this.address = address;
        this.hallsList = hallsList;
    }
    public void printProgramme(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime weekLater = now.plusDays(7);
        System.out.println("REPERTUAR KINO "+name);
        for(Hall hall : hallsList){
            String hallName = hall.getHallName();
            System.out.println(hallName+":");
            List<Show> showList = hall.getShowList();
            for(Show show : showList){
                LocalDateTime showDate = show.getDate();
                if(showDate.isAfter(now) && showDate.isBefore(weekLater)){
                    System.out.println("===========================");
                    LocalDateTime data = show.getDate();
                    System.out.println(data);
                    Movie movie = show.getMovie();
                    System.out.println(movie.getTitle());
                    System.out.println(movie.getDirector());
                    System.out.println(movie.getDescription());
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Hall> getHallsList() {
        return hallsList;
    }

    public void setHallsList(List<Hall> hallsList) {
        this.hallsList = hallsList;
    }
}
