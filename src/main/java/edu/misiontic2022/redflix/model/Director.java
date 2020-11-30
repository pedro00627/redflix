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
public class Director {

    @Id
    int dirId;//   primary key,
    String dirNombre;
    String dirApellido;
    String dirNacionalidad;

    public int getDirId() {
        return dirId;
    }

    public void setDirId(int dirId) {
        this.dirId = dirId;
    }

    public String getDirNombre() {
        return dirNombre;
    }

    public void setDirNombre(String dirNombre) {
        this.dirNombre = dirNombre;
    }

    public String getDirApellido() {
        return dirApellido;
    }

    public void setDirApellido(String dirApellido) {
        this.dirApellido = dirApellido;
    }

    public String getDirNacionalidad() {
        return dirNacionalidad;
    }

    public void setDirNacionalidad(String dirNacionalidad) {
        this.dirNacionalidad = dirNacionalidad;
    }

    public Director() {
    }

    public Director(int dirId, String dirNombre, String dirApellido, String dirNacionalidad) {
        this.dirId = dirId;
        this.dirNombre = dirNombre;
        this.dirApellido = dirApellido;
        this.dirNacionalidad = dirNacionalidad;
    }

    @Override
    public String toString() {
        return "Director{" + "dirId=" + dirId + ", dirNombre=" + dirNombre + ", dirApellido=" + dirApellido + ", dirNacionalidad=" + dirNacionalidad + '}';
    }
}
