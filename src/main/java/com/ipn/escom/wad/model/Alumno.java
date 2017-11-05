package com.ipn.escom.wad.model;

import java.io.Serializable;

/**
 *
 * @author fernanda
 */
public class Alumno implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private long id;
    private String nombre;
    private String paterno;
    private long idCarrera;

    public Alumno() {
    }

    public Alumno(long id, String nombre, String paterno, long idCarrera) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.idCarrera = idCarrera;
    }

    public Alumno(String nombre, String paterno, long idCarrera) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.idCarrera = idCarrera;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public long getIdCarrera() {
        return idCarrera;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setIdCarrera(long idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", paterno=" + paterno + ", idCarrera=" + idCarrera + '}';
    }
}
