package com.eam.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.Categoria;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
}
