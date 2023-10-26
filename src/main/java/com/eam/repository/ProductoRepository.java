package com.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
    List<Producto> findByNameContaining(String searchTerm);
}
