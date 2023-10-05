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
    private UserRepository userRepository;
    @GetMapping
    public ResponseEntity<List<User>> show(){
    return ResponseEntity.ok(userRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id) {
        User usuario = userRepository.getById(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return ResponseEntity.badRequest().body("El correo electrónico ya existe.");
        }
        else if (userRepository.existsByUserName(user.getUserName())) {
                return ResponseEntity.badRequest().body("El usuario ya existe.");
        }else {
            User createdUser = userRepository.save(user);
            return ResponseEntity.ok(createdUser);
        }
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User usuario){
        usuario.setId(id);
        return userRepository.save(usuario);
    }
    @DeleteMapping("/{usuarioId}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        userRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
