package org.multipleks.struktura;

import org.multipleks.repertuar.Show;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private Screen screen;
    private SeatsPlan seatsPlan;
    private List<Show> showList = new ArrayList<>();


    public Hall (Screen screen, SeatsPlan seatsPlan){
        this.screen = screen;
        this.seatsPlan = seatsPlan;
        this.showList = showList;
    };

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
