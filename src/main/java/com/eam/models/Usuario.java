package com.eam.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "user_name")
    private String nombre;
    @Column(name = "user_userName")
    private String userName;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_direccion")
    private String direccion;
    @Column(name = "user_tel")
    private String telefono;
    @Column(name = "user_tipo")
    private String tipo;
    @Column(name = "user_password")
    private String password;
    /*@OneToMany(mappedBy = "usuario")
    private List<Producto> productos;*/
    @OneToMany(mappedBy = "usuario")
    private List<Orden> ordenes;

    public Usuario(Integer id, String nombre, String userName, String email, String direccion, String telefono, String tipo, String password) {
        this.id = id;
        this.nombre = nombre;
        this.userName = userName;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
        this.password = password;
    }

    public Usuario() {
    }

    public Usuario(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
    }
}
