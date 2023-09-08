package com.eam.models;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity()
@Table(name = "detalles")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int cantidad;
    private double precio;
    private double total;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "id")
    private Orden orden;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "productoId")
    private Producto producto;
}
