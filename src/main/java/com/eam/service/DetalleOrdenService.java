package com.eam.service;

import com.eam.models.DetalleOrden;
import com.eam.repository.DetalleOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleOrdenService {
    @Autowired
    private DetalleOrdenRepository detalleOrdenRepository;

    public List<DetalleOrden> findAll() {
        return detalleOrdenRepository.findAll();
    }

    public DetalleOrden findById(Long id) {
        return detalleOrdenRepository.findById(id).orElse(null);
    }

    public DetalleOrden save(DetalleOrden detalleOrden) {
        return detalleOrdenRepository.save(detalleOrden);
    }

    public void deleteById(Long id) {
        detalleOrdenRepository.deleteById(id);
    }
}
