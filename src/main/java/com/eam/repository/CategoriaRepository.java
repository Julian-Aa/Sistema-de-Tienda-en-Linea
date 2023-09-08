package com.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.Categoria;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "categorias", collectionResourceRel = "tareas")
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
