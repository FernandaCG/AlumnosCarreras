package com.ipn.escom.wad.model;

import java.io.Serializable;

/**
 *
 * @author fernanda
 */
public class Usuario implements Serializable {

    private long id;
    private String correo;
    private String password;
    
    public Usuario() {
    
    }

    public Usuario(long id, String correo, String password) {
        this.id = id;
        this.correo = correo;
        this.password = password;
    }

    public Usuario(String correo, String password) {
        this.correo = correo;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", correo=" + correo + ", password=" + password + '}';
    }

}
