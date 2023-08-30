package com.eam.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.Producto;

public interface IAProducto extends JpaRepository<Producto, Long>{

}
