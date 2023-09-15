package com.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.Categoria;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
}
