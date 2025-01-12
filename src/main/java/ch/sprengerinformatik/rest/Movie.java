package ch.sprengerinformatik.rest;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Movie extends PanacheEntity {
    public String title;
    public String genre;
    public int year;
    public double rating;

    public Movie() {}

    public Movie(Long id, String title, String genre, int year, double rating) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }
}