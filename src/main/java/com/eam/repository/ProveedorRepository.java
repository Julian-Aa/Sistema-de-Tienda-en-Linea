package com.eam.repository;

import com.eam.models.Categoria;
import com.eam.models.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long>{
}
