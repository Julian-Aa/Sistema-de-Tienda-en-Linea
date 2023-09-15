package com.eam.controller;

import com.eam.models.Producto;
import com.eam.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping
    public ResponseEntity<List<Producto>> show(){
    return ResponseEntity.ok(productoService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Producto> getById(@PathVariable Long id) {
        Producto producto = productoService.findById(id);
        if (producto != null) {
            return ResponseEntity.ok(producto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Producto> create(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.save(producto));
    }
    @PutMapping("/{id}")
    public Producto update(@PathVariable Long id,@RequestBody Producto producto){
        producto.setProductoId(id);
        return productoService.save(producto);
    }
    @DeleteMapping("/{productoId}")
    public ResponseEntity<String> delete(@PathVariable Long productoId){
        productoService.deleteById(productoId);
        return ResponseEntity.noContent().build();
    }
}
