package com.eam.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Data
@Entity(name = "categorias")
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    private long categoriaId;
    @Column(name = "cat_nombre")
    private String nombre;
    @OneToMany(mappedBy = "categoria")
    private ArrayList<Producto> productos;

}
