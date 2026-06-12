package org.multipleks.struktura;

public class Seat {
    private SeatType type;
    private SeatState seatState;
    private int number;
    private String rowName;

    public Seat(SeatType type, int number) {
        this.type = type;
        this.number = number;
        this.seatState = SeatState.AVAILABLE;
    }
    public boolean isAvailable() {
        return seatState == SeatState.AVAILABLE;
    }

    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }

    public SeatState getSeatState() {
        return seatState;
    }

    public void setSeatState(SeatState seatState) {
        this.seatState = seatState;
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
