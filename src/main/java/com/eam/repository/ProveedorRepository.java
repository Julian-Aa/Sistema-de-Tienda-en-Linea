package com.eam.repository;

import com.eam.models.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long>{
    boolean existsProveedorByEmail(String email);
}
