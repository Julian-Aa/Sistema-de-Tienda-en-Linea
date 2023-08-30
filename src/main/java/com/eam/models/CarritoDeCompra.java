package com.eam.models;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarritoDeCompra{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	ArrayList<Producto> productos = new ArrayList<>();

	public CarritoDeCompra() {
		super();
	}

	public CarritoDeCompra(ArrayList<Producto> productos) {
		this.productos = productos;
	}
/*	public boolean anadirProducto(Producto producto) {
		boolean anadido = false;
		if(!productos.isEmpty()) {
			for (int i = 0; i < productos.size(); i++) {
				if(!productos.get(i).getCodigo().equals(producto.getCodigo())) {
					productos.add(producto);
					anadido = true;	
				}
			}
		}else {
			productos.add(producto);
			anadido = true;
		}
		return anadido;
	}
	public void listarProducto() {
		if (!productos.isEmpty()) {
			for (Producto producto : productos) {
				System.out.println(producto.getNombre()+"| "+ producto.getCodigo());
			}
		}else {
			System.out.println("No hay productos en esta categoria");
		}
	}
	public boolean actualizarProducto(Producto producto) {
		boolean modificado = false;
		if (!productos.isEmpty()) {
			for (int i = 0; i < productos.size(); i++) {
				if (productos.get(i).getCodigo().trim() == producto.getCodigo().trim()) {
					productos.get(i).setCantidad(producto.getCantidad());
					productos.get(i).setNombre(producto.getNombre());
					productos.get(i).setPrecio(producto.getPrecio());
				}
			}
		}
		return modificado;
	}
	public boolean eliminarProducto(String codigo) {
		boolean eliminado = false;
		if(!productos.isEmpty()){
			for (int i = 0; i < productos.size(); i++) {
				if (productos.get(i).getCodigo().equals(codigo)) {
					productos.remove(i);
					eliminado = true;
				}
			}
		}
		return eliminado;
	}*/
}
