package org.multipleks;

import org.multipleks.IO.MovieLoader;

import java.util.List;

public class Cinema {

    private String name;
    private String address;
    private List<Hall> hallsList;

    public Cinema(String cinemaName, String adress, List<Hall> hallsList) {
        this.name = cinemaName;
        this.address = adress;
        this.hallsList = hallsList;

    }

    public void printProgramme(){
    }


}
