package com.eam.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "carritodecompras")
public class CarritoDeCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private long carrito_id;
    @OneToOne()
    @JoinColumn(name = "user_id")
    private User usuario;


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
