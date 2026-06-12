package org.multipleks.struktura;

import java.util.ArrayList;
import java.util.List;

public class SeatsPlan {
    private List<Row> rowList;

    public SeatsPlan(List<Row> rowList) {
        this.rowList = rowList;
        for (int i = 0; i < rowList.size(); i++){
            if (rowList.size() > 26) {
                throw new IllegalArgumentException("Osiągnięto limit rzędów w sali kinowej");
            }
            int asciStart = 65 + i;
            rowList.get(i).setRowName(String.valueOf((char) asciStart));
        }
    }
    public List<Seat> findAndReserve(String... seatIndexes){
        List<Seat> seatList = new ArrayList<>();
        for (String seatIndex : seatIndexes){
            boolean rowFound = false;
            for (int i = 0; i<rowList.size(); i++) {
                if (rowList.get(i).getRowName().equals(seatIndex.substring(0, 1))) {
                    rowFound = true;
                    int seatNumber = Integer.parseInt(seatIndex.substring(1));
                    Seat seat = rowList.get(i).getSeatsList().get(seatNumber-1);
                    if(seat.isAvailable()){
                        seat.setSeatState(SeatState.NOTAVAILABLE);
                        seatList.add(seat);
                    }else throw new IllegalArgumentException("To miejsce jest już zajęte");
                }
            }
            if (!rowFound) {
                throw new IllegalArgumentException("Nie istnieje rząd: " + seatIndex.substring(0, 1));
            }
        }
        return seatList;
    }

    public List<Row> getRowList() {
        return rowList;
    }

    public void setRowList(List<Row> rowList) {
        this.rowList = rowList;
    }
}
