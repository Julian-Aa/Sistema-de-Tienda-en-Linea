package com.eam.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orden_id")
    private Long id;
    @Column(name = "orden_num")
    private String numero;
    @Column(name = "orden_fechaCrea")
    private Date fechaCreacion;
    @Column(name = "orden_fechaReci")
    private Date fechaRecibida;
    @Column(name = "orden_total")
    private double total;
    @ManyToOne
    private Usuario usuario;
    @OneToOne
    private DetalleOrden detalleOrden;
}
