package com.eam.service;

import com.eam.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    public Producto save(Producto producto);
    public Optional<Producto> get(Long id);
    public void path(Producto producto);
    public void update(Producto producto);
    public void delete(Long id);
    public List<Producto> findAll();
}
