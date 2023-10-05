package com.eam.controller;

import com.eam.models.Categoria;
import com.eam.models.Producto;
import com.eam.models.Proveedor;
import com.eam.repository.CategoriaRepository;
import com.eam.repository.ProveedorRepository;
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
    @Autowired
    private ProveedorRepository proveedorRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;
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
    public ResponseEntity<?> create(@RequestBody Producto producto) {
        Categoria categoria = categoriaRepository.findById(producto.getCategory().getCategoryId()).orElse(null);
        Proveedor proveedor = proveedorRepository.findById(producto.getProveedor().getIdProveedor()).orElse(null);

        if (categoria != null && proveedor != null) {
            producto.setCategory(categoria);
            producto.setProveedor(proveedor);
            productoService.save(producto);
        } else {
            // Manejar errores si la categoría o el proveedor no existen
            // Puedes lanzar una excepción o devolver un mensaje de error adecuado
            return null;
        }
            Producto createdProduct = productoService.save(producto);
            return ResponseEntity.ok(createdProduct);

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
