package org.multipleks.struktura;

import java.util.ArrayList;
import java.util.List;

public class HallFactory {

    public static Hall createVipHall(int numberOfSeatsInRow, int numberOfRows) {

        Screen screen = new Screen(ScreenType.STANDARD);
        List<Row> rows = new ArrayList<>();

        for (int i = 1; i <= numberOfRows; i++){
            List<Seat> seats = new ArrayList<>();
            for (int z = 1; z <= numberOfSeatsInRow; z++) {
                seats.add(new Seat(SeatType.COMFORT, z));
            }
            rows.add(new Row("void", seats));
        }

        SeatsPlan seatsPlan = new SeatsPlan(rows);
        return new Hall(screen, seatsPlan);
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
    public static Hall createNormalHall(int numberOfSeats){
        Screen screen = new Screen(ScreenType.STANDARD);
        List<Seat> seats = new ArrayList<>();

        for (int i = 1; i <= numberOfSeats; i++) {
            seats.add(
                    new Seat(SeatType.STANDARD, i)
            );
        }
        return new Hall(screen,seats);
    }
}
