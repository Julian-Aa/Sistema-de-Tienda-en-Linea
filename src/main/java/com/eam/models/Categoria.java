package com.eam.models;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    private long categoryId;
    @Column(name = "cat_name")
    private String name;
}