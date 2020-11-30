/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package edu.misiontic2022.redflix.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author pedro
 */
@Entity
@Table
public class Pelicula {

    @Id
    int peliculaId;
    @OneToOne()
    @JoinColumn(name = "contenido_id")
    Contenido contenido;
    String resumen;
    int anio;
    @ManyToOne
    @JoinColumn(name = "dir_id")
    Director director;

    public int getPeliculaId() {
        return peliculaId;
    }

    public void setPeliculaId(int peliculaId) {
        this.peliculaId = peliculaId;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Pelicula() {
    }

    public Pelicula(int peliculaId, Contenido contenido, String resumen, int anio, Director director) {
        this.peliculaId = peliculaId;
        this.contenido = contenido;
        this.resumen = resumen;
        this.anio = anio;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "peliculaId=" + peliculaId + ", contenido=" + contenido + ", resumen=" + resumen + ", anio=" + anio + ", director=" + director + '}';
    }

    

}
