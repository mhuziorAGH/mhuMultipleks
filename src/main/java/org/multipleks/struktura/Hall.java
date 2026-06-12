package org.multipleks.struktura;

import org.multipleks.repertuar.Show;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private String hallName;
    private Screen screen;
    private SeatsPlan seatsPlan;
    private double price;
    private List<Show> showList = new ArrayList<>();


    public Hall (Screen screen, SeatsPlan seatsPlan, double price){
        this.screen = screen;
        this.seatsPlan = seatsPlan;
        this.price = price;
    };

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public double getPrice() {
        return price;
    }

    public void addShow(Show show){
        showList.add(show);
    }
    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }

    public SeatsPlan getSeatsPlan() {
        return seatsPlan;
    }

    public void setSeatsPlan(SeatsPlan seatsPlan) {
        this.seatsPlan = seatsPlan;
    }
}
