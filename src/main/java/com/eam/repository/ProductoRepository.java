package com.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.Producto;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "productos", collectionResourceRel = "productos")
public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
