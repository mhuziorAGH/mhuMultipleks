package org.multipleks.rezerwacja;
import org.multipleks.repertuar.Show;
import org.multipleks.struktura.Seat;
import org.multipleks.struktura.SeatsPlan;

import java.util.List;

public class Reservation {
    private Show show;
    private Customer customer;
    private List<Seat> seats;

    public Reservation(Show show, List<Seat> seats, Customer customer) {
        this.show = show;
        this.seats = seats;
        this.customer = customer;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
