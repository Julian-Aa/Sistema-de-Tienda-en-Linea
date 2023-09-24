package com.eam.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "usuarios")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_userName")
    private String userName;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_direccion")
    private String address;
    @Column(name = "user_tel")
    private String phone;
    @Column(name = "user_tipo")
    private String type;
    @Column(name = "user_password")
    private String password;
    @OneToMany(mappedBy = "usuario")
    private List<Orden> checks;
    public User() {
    }

    public User(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public User(Long id, String name, String userName, String email, String address, String phone, String type, String password, List<Orden> checks) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.type = type;
        this.password = password;
        this.checks = checks;
    }
}
