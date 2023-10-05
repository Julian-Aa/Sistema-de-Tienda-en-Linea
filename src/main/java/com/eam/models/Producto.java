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
    private Long productoId;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_description")
    private String description;
    @Column(name = "product_price")
    private double price;
    @Column(name = "product_quantity")
    private int quantity;
    @Column(name = "product_image")
    private String image;
    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Categoria category;
    @ManyToOne
    @JoinColumn(name = "prove_id")
    private Proveedor proveedor;
    public Producto() {
    }
}
