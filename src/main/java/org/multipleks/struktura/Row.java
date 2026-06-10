package org.multipleks.struktura;

import java.util.List;

public class Row {
    private String rowName;
    private List<Seat> seatsList;

    public Row(String rowName, List<Seat> seatsList) {
        this.rowName = rowName;
        this.seatsList = seatsList;
    }

    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }

    public List<Seat> getSeatsList() {
        return seatsList;
    }

    public void setSeatsList(List<Seat> seatsList) {
        this.seatsList = seatsList;
    }
}
