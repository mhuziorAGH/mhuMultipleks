package org.multipleks.rezerwacja;

import java.util.ArrayList;
import java.util.List;

public class RegisteredCustomer extends Customer {
    private String login;
    private String password;
    private List<Reservation> reservationHistory = new ArrayList<>();

    public RegisteredCustomer(String email, String firstName, String lastName, String login, String password) {
        super(email, firstName, lastName);
        this.login = login;
        this.password = password;
    }
    public void addReservation(Reservation reservation) {
        reservationHistory.add(reservation);
    }
}
