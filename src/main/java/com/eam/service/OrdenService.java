package com.eam.service;

import com.eam.models.DetalleOrden;
import com.eam.models.Orden;
import com.eam.repository.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {
    @Autowired
    private OrdenRepository ordenRepository;

    public List<Orden> findAll() {
        return ordenRepository.findAll();
    }

    public Orden findById(Long id) {
        return ordenRepository.findById(id).orElse(null);
    }

    public Orden save(Orden orden) {
        return ordenRepository.save(orden);
    }

    public void deleteById(Long id) {
        ordenRepository.deleteById(id);
    }
}
