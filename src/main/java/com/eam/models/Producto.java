package com.eam.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Producto {
    @Id     
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productoId;
    @Column(name = "product_name")
    private String nombre;
    @Column(name = "product_precio")
    private String precio;
    @Column(name = "product_descri")
    private String descripcion;
    @Column(name = "product_cant")
    private int cantidad;
    @Column(name = "product_img")
    private String imagenUrl;
    /*@ManyToOne
    @JoinColumn(name = "cate_id")
    private Categoria categoria;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "prove_id")
    private Proveedor proveedor;*/
}
