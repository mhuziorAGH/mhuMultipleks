package org.multipleks;

import org.multipleks.struktura.*;

import java.util.ArrayList;
import java.util.List;

public class HallFactory {

    public static Hall createVipHall(int numberOfSeats) {

        Screen screen = new Screen(ScreenType.STANDARD);

        List<Seat> seats = new ArrayList<>();

        for (int i = 1; i <= numberOfSeats; i++) {
            seats.add(
                    new Seat(SeatType.COMFORT, i)
            );
        }
        return new Hall(screen, seats);
    }
    public static Hall create3DHall(int numberOfSeats){
        Screen screen = new Screen(ScreenType.THREE_D);
        List<Seat> seats = new ArrayList<>();

        for (int i = 1; i <= numberOfSeats; i++) {
            seats.add(
                    new Seat(SeatType.STANDARD, i)
            );
        }
        return new Hall(screen,seats);
    }
}
