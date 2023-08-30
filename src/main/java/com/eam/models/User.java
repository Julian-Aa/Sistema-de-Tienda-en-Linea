package com.eam.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User extends Persona{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombreUsuario;
	private String email;
    private String contrasena;
    private boolean esAdmin;
	/**
	 * 
	 */
	public User() {
		super();
	}
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param cedula
	 * @param id
	 * @param nombreUsuario
	 * @param email
	 * @param contrasena
	 * @param esAdmin
	 */
	public User(String nombre, String apellido, int edad, String cedula, Long id, String nombreUsuario, String email,
			String contrasena, boolean esAdmin) {
		super(nombre, apellido, edad, cedula);
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.contrasena = contrasena;
		this.esAdmin = esAdmin;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}
	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	/**
	 * @return the esAdmin
	 */
	public boolean isEsAdmin() {
		return esAdmin;
	}
	/**
	 * @param esAdmin the esAdmin to set
	 */
	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}
}
