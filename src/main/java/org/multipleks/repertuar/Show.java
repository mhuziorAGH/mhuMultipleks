package org.multipleks.repertuar;

import org.multipleks.struktura.Hall;

import java.util.Date;

public class Show {
    private Movie movie;
    private Hall hall;
    private Date date;

    public Show(Movie movie, Hall hall, Date date) {
        this.movie = movie;
        this.hall = hall;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
