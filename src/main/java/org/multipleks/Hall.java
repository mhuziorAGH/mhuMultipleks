package org.multipleks;

import java.util.List;

public class Hall {
    private Screen screen;
    private List<Seat> seatsList;

    public Hall (Screen screen, List<Seat> seatsList){
        this.screen = screen;
        this.seatsList = seatsList;
    };
}
