package com.eam.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.CarritoDeCompra;

public interface IACarritoDeCompra extends JpaRepository<CarritoDeCompra, Long>{

}
