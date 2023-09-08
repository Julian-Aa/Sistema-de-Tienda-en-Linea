package com.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.CarritoDeCompra;
import org.springframework.stereotype.Repository;

@Repository
public interface IACarritoDeCompra extends JpaRepository<CarritoDeCompra, Long>{

}
