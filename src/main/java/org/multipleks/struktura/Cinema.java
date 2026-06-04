package org.multipleks.struktura;

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
