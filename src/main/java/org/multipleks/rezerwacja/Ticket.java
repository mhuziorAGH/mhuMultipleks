package org.multipleks.rezerwacja;

import org.multipleks.repertuar.Show;
import org.multipleks.struktura.Row;
import org.multipleks.struktura.Seat;

public class Ticket {
    private Seat seat;
    private Show show;
    private double price;

    public Ticket(Seat seat, Show show, double price) {
        this.seat = seat;
        this.show = show;
        this.price = price;
    }
    public void printTicket(){
        System.out.println("===========================");
        System.out.println("Bilet na:");
        String title = show.getMovie().getTitle();
        System.out.println(title);
        System.out.println("Sala:");
        String hallName = show.getHall().getHallName();
        System.out.println(hallName);
        System.out.println("Rząd:");
        String rowPlace = seat.getRowName();
        System.out.println(rowPlace);
        System.out.println("Miejsce:");
        int seatPlace = seat.getNumber();
        System.out.println(seatPlace);
        System.out.println("Cena: "+price+" PLN");
        System.out.println("===========================");
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
