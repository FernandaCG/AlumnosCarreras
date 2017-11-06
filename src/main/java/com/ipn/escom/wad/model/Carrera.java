package com.ipn.escom.wad.model;

import java.io.Serializable;

/**
 *
 * @author fernanda
 */
public class Carrera implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idCarrera;
    private String nombreCarrera;

    public Carrera() {
    }

    public Carrera(Long IdCarrera, String NombreCarrera) {
        this.idCarrera = IdCarrera;
        this.nombreCarrera = NombreCarrera;
    }

    public Long getIdCarrera() {
        return idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setIdCarrera(Long IdCarrera) {
        this.idCarrera = IdCarrera;
    }

    public void setNombreCarrera(String NombreCarrera) {
        this.nombreCarrera = NombreCarrera;
    }

    @Override
    public String toString() {
        return "Carrera{" + "IdCarrera=" + idCarrera + ", NombreCarrera=" + nombreCarrera + '}';
    }
}
