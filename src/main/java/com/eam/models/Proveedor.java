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

    public long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
