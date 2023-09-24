package com.eam.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prove_id")
    private long idProveedor;
    @Column(name = "proveedor_name")
    private String name;
    @Column(name = "proveedor_address")
    private String address;
    @Column(name = "proveedor_phone")
    private  String phone;
    @Column(name = "proveedor_email")
    private  String email;
    public Proveedor() {
    }

    public Proveedor(long idProveedor, String name) {
        this.idProveedor = idProveedor;
        this.name = name;
    }

}
