/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.misiontic2022.redflix.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author pedro
 */
@Entity
@Table
public class Serie {

    @Id
    int serieId;
    @OneToOne()
    @JoinColumn(name = "contenido_id")
    Contenido contenido;
    int numeroTemporadas;
    int numeroEpisodios;

    public int getSerieId() {
        return serieId;
    }

    public void setSerieId(int serieId) {
        this.serieId = serieId;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public Serie() {
    }

    public Serie(int serieId, Contenido contenido, int numeroTemporadas, int numeroEpisodios) {
        this.serieId = serieId;
        this.contenido = contenido;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroEpisodios = numeroEpisodios;
    }

    @Override
    public String toString() {
        return "Serie{" + "serieId=" + serieId + ", contenido=" + contenido + ", numeroTemporadas=" + numeroTemporadas + ", numeroEpisodios=" + numeroEpisodios + '}';
    }
    
    
}
