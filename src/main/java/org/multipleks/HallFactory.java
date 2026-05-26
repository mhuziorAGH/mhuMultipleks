package org.multipleks;

import java.util.ArrayList;
import java.util.List;

public class HallFactory {

    public static Hall createVipHall(int numberOfSeats) {

        Screen screen = new Screen(ScreenType.STANDARD);

        List<Seat> seats = new ArrayList<>();

        seats.add(new Seat(SeatType.COMFORT, numberOfSeats));

        return new Hall(screen, seats);
    }
    public static Hall create3DHall(int nummberOfSeats){
        Screen screen = new Screen(ScreenType.THREE_D);
        List<Seat> seats = new ArrayList<>();

        seats.add(new Seat(SeatType.STANDARD, nummberOfSeats));

        return new Hall(screen,seats);
    }
}
