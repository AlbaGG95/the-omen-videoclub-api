package com.theomen.videoclub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private Integer anio;

    @Column(nullable = false)
    private Double rating;

    @Column(length = 500)
    private String poster;

    @Column(columnDefinition = "TEXT")
    private String sinopsis;

    public Movie() {
    }

    public Movie(String titulo, Integer anio, Double rating, String poster, String sinopsis) {
        this.titulo = titulo;
        this.anio = anio;
        this.rating = rating;
        this.poster = poster;
        this.sinopsis = sinopsis;
    }

    public Movie(Long id, String titulo, Integer anio, Double rating, String poster, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.rating = rating;
        this.poster = poster;
        this.sinopsis = sinopsis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
