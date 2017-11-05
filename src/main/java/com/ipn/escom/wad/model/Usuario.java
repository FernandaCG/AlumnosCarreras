package com.ipn.escom.wad.model;

import java.io.Serializable;

/**
 *
 * @author fernanda
 */
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	private String correo;
	private String password;
	private String rol;

	public Usuario() {

	}

	public Usuario(long id, String correo, String password, String rol) {
		this.id = id;
		this.correo = correo;
		this.password = password;
		this.rol = rol;
	}

	public Usuario(String correo, String password, String rol) {
		this.correo = correo;
		this.password = password;
		this.rol = rol;
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

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", correo=" + correo + ", password=" + password + ", rol=" + rol + "]";
	}

}
