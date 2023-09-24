package com.eam.controller;

import com.eam.models.User;
import com.eam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserRepository usuarioRepository;
    @GetMapping
    public ResponseEntity<List<User>> show(){
    return ResponseEntity.ok(usuarioRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id) {
        User usuario = usuarioRepository.getById(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User usuario) {
        return ResponseEntity.ok(usuarioRepository.save(usuario));
    }
    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User usuario){
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }
    @DeleteMapping("/{usuarioId}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        usuarioRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
