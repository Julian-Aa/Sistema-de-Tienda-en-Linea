package com.eam.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.Categoria;

public interface IACategoria extends JpaRepository<Categoria, Long>{

}
