/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.misiontic2022.redflix.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author pedro
 */
@Entity
@Table


public class Contenido {

    @Id
    int contenidoId;
    String titulo;

    public int getContenidoId() {
        return contenidoId;
    }

    public void setContenidoId(int contenidoId) {
        this.contenidoId = contenidoId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Contenido() {
    }

    public Contenido(int contenidoId, String titulo) {
        this.contenidoId = contenidoId;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Contenido{" + "contenidoId=" + contenidoId + ", titulo=" + titulo + '}';
    }

}
