package org.multipleks.repertuar;

import org.multipleks.rezerwacja.Customer;
import org.multipleks.rezerwacja.RegisteredCustomer;
import org.multipleks.rezerwacja.Reservation;
import org.multipleks.struktura.Hall;
import org.multipleks.struktura.Seat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Show {
    private Movie movie;
    private Hall hall;
    private LocalDateTime date;
    private List<Reservation> reservationList = new ArrayList<>();

    public Show(Movie movie, Hall hall, LocalDateTime date) {
        this.movie = movie;
        this.hall = hall;
        this.date = date;
    }
    public void reservePlaces(Customer customer, String... seatIndexes){
        if (LocalDateTime.now().isBefore(date)){
            List<Seat> reservedSeats = hall.getSeatsPlan().findAndReserve(seatIndexes);
            Reservation reservation = new Reservation(this, reservedSeats, customer);
            reservationList.add(reservation);
            if (customer instanceof RegisteredCustomer) {
                ((RegisteredCustomer) customer).addReservation(reservation);
            }
        } else throw new IllegalArgumentException("Nie można kupić biletów po dacie seansu");
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
