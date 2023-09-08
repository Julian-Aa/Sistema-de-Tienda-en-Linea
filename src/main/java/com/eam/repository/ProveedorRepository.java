package com.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.Proveedor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

}
