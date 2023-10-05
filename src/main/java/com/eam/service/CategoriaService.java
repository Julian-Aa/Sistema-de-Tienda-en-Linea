package com.eam.service;

import com.eam.models.Categoria;
import com.eam.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() { return categoriaRepository.findAll();}

    public Categoria finById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void dele(Long id) {
        categoriaRepository.deleteById(id);
    }
}
