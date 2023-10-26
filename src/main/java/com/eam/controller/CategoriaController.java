package com.eam.controller;

import com.eam.models.Categoria;
import com.eam.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping
    public ResponseEntity<List<Categoria>> show(){
    return ResponseEntity.ok(categoriaService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getById(@PathVariable Long id) {
        Categoria categoria = categoriaService.findById(id);
        if (categoria != null) {
            return ResponseEntity.ok(categoria);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Categoria> create(@RequestBody Categoria categoria) {
        return ResponseEntity.ok(categoriaService.save(categoria));
    }
    @PutMapping("/{id}")
    public Categoria update(@PathVariable Long id,@RequestBody Categoria categoria){
        categoria.setCategoryId(id);
        return categoriaService.save(categoria);
    }
    @DeleteMapping("/{categoryId}")
    public ResponseEntity<String> delete(@PathVariable Long categoryId){
        categoriaService.deleteById(categoryId);
        return ResponseEntity.noContent().build();
    }


}
