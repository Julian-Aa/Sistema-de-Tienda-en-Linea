package com.eam.controller;

import com.eam.models.Proveedor;
import com.eam.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
@CrossOrigin(origins = "http://localhost:4200")
public class ProveedorController {
    @Autowired
    private ProveedorRepository proveedorRepository;
    @GetMapping
    public ResponseEntity<List<Proveedor>> show(){
    return ResponseEntity.ok(proveedorRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Proveedor> getById(@PathVariable Long id) {
        Proveedor proveedor = proveedorRepository.getById(id);
        if (proveedor != null) {
            return ResponseEntity.ok(proveedor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Proveedor> create(@RequestBody Proveedor proveedor) {
        return ResponseEntity.ok(proveedorRepository.save(proveedor));
    }
    @PutMapping("/{id}")
    public Proveedor update(@PathVariable Long id,@RequestBody Proveedor proveedor){
        proveedor.setIdProveedor(id);
        return proveedorRepository.save(proveedor);
    }
    @DeleteMapping("/{categoriaId}")
    public ResponseEntity<String> delete(@PathVariable Long proveedorId){
        proveedorRepository.deleteById(proveedorId);
        return ResponseEntity.noContent().build();
    }


}
