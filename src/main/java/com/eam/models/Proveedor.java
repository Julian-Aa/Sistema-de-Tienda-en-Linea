package com.eam.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proveedor extends Persona{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProveedor;

	public Proveedor(long idProveedor) {
		super();
		this.idProveedor = idProveedor;
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param cedula
	 * @param idProveedor
	 */
	public Proveedor(String nombre, String apellido, int edad, String cedula, long idProveedor) {
		super(nombre, apellido, edad, cedula);
		this.idProveedor = idProveedor;
	}

	/**
	 * @return the idProveedor
	 */
	public long getIdProveedor() {
		return idProveedor;
	}

	/**
	 * @param idProveedor the idProveedor to set
	 */
	public void setIdProveedor(long idProveedor) {
		this.idProveedor = idProveedor;
	}
	
}
