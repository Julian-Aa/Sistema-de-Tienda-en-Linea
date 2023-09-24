package com.eam.controller;

import com.eam.models.Categoria;
import com.eam.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @GetMapping
    public ResponseEntity<List<Categoria>> show(){
    return ResponseEntity.ok(categoriaRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> getById(@PathVariable Long id) {
        Categoria categoria = categoriaRepository.getById(id);
        if (categoria != null) {
            return ResponseEntity.ok(categoria);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Categoria> create(@RequestBody Categoria categoria) {
        return ResponseEntity.ok(categoriaRepository.save(categoria));
    }
    @PutMapping("/{id}")
    public Categoria update(@PathVariable Long id,@RequestBody Categoria categoria){
        categoria.setCategoryId(id);
        return categoriaRepository.save(categoria);
    }
    @DeleteMapping("/{categoriaId}")
    public ResponseEntity<String> delete(@PathVariable Long categoriaId){
        categoriaRepository.deleteById(categoriaId);
        return ResponseEntity.noContent().build();
    }


}
