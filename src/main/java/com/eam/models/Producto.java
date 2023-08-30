package com.eam.models;
import javax.swing.*;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productoId;
	private String nombre;
	private String precio;
	private String descripcion;
	private int cantidad;
	private ImageIcon imagen;
	private Categoria categoria;
	private Proveedor proveedor;
	/**
	 * @param productoId
	 * @param nombre
	 * @param precio
	 * @param descripcion
	 * @param cantidad
	 * @param imagen
	 * @param categoria
	 * @param proveedor
	 */
	public Producto(long productoId, String nombre, String precio, String descripcion, int cantidad, ImageIcon imagen,
			Categoria categoria, Proveedor proveedor) {
		super();
		this.productoId = productoId;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.imagen = imagen;
		this.categoria = categoria;
		this.proveedor = proveedor;
	}
	/**
	 * @return the productoId
	 */
	public long getProductoId() {
		return productoId;
	}
	/**
	 * @param productoId the productoId to set
	 */
	public void setProductoId(long productoId) {
		this.productoId = productoId;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the precio
	 */
	public String getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the imagen
	 */
	public ImageIcon getImagen() {
		return imagen;
	}
	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}
	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}
	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	} 

}
