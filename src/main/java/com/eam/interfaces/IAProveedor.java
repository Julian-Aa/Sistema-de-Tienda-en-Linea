package com.eam.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.Proveedor;

public interface IAProveedor extends JpaRepository<Proveedor, Long> {

}
