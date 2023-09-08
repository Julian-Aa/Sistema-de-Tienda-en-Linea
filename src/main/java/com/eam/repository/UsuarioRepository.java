package com.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
