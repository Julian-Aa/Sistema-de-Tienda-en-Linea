package com.eam.service;

import com.eam.models.Categoria;
import com.eam.models.Proveedor;
import com.eam.repository.CategoriaRepository;
import com.eam.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {
    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<Proveedor> findAll() {
        return proveedorRepository.findAll();
    }

    public Proveedor finById(Long id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    public Proveedor save(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public void deleteById(Long id) {
        proveedorRepository.deleteById(id);
    }
    public boolean existsProveedorByEmail(String email){
        return  proveedorRepository.existsProveedorByEmail(email);
    }
}
