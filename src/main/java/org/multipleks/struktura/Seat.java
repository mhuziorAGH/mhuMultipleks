package org.multipleks.struktura;

public class Seat {
    private SeatType type;
    private int number;

    public Seat(SeatType type, int number) {
        this.type = type;
        this.number = number;
    }

    public SeatType getType() {
        return type;
    }

    public void setType(SeatType type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
