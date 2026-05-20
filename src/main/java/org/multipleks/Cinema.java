package org.multipleks;

import org.multipleks.IO.MovieLoader;

import java.util.List;

public class Cinema {

    private String name;
    private String address;
    private List<String> programme;

    public Cinema(String cinemaName, String adress, List<String> programme) {
        this.name = cinemaName;
        this.address = adress;
        this. programme =programme;

    }

    public void printProgramme(){
        System.out.println(programme);
    }


}
