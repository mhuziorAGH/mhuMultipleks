package org.multipleks.struktura;

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

    public List<Row> getRowList() {
        return rowList;
    }

    public void setRowList(List<Row> rowList) {
        this.rowList = rowList;
    }
}
