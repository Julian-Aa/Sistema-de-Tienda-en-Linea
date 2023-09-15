package com.eam.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Data
@Entity(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proveedor_id")
    private long idProveedor;
   /* @OneToMany
    @JoinColumn(name = "productos")
    private ArrayList<Producto> productos;*/
}
