package org.multipleks.repertuar;

public class Movie {
    private int id;
    private String title;
    private String director;
    private String description;
    private int durationInMinutes;

    public Movie() {
    }

    public Movie(int id, String director, String title, String description, int durationInMinutes) {
        this.id = id;
        this.director = director;
        this.title = title;
        this.description = description;
        this.durationInMinutes = durationInMinutes;
    }

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
