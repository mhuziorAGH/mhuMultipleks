package org.multipleks.rezerwacja;

public class RegisteredCustomer extends Customer {
    private String login;
    private String password;

    public RegisteredCustomer(String email, String firstName, String lastName, String login, String password) {
        super(email, firstName, lastName);
        this.login = login;
        this.password = password;
    }
}
