package com.eam.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "carritos")
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carritoId;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;
    private Date fecha;

}
