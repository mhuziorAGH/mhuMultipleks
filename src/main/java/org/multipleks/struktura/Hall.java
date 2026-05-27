package org.multipleks.struktura;

import org.multipleks.repertuar.Show;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private Screen screen;
    private List<Seat> seatsList;
    private List<Show> showList = new ArrayList<>();

    public Hall (Screen screen, List<Seat> seatsList){
        this.screen = screen;
        this.seatsList = seatsList;
        this.showList = showList;
    };
}
