package com.eam.controller;

import com.eam.models.User;
import com.eam.repository.UserRepository;
import com.eam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> show() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id) {
        User usuario = userService.findById(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/login")
    public ResponseEntity<User> getUsuario(@RequestBody User usuario) {
        User usu = userService.login(usuario.getEmail(), usuario.getPassword());
        if (usu != null) {
            return ResponseEntity.ok(usu);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        if (userService.existsByEmail(user.getEmail())) {
            return ResponseEntity.badRequest().body("El correo electrónico ya existe.");
        } else {
            User createdUser = userService.save(user);
            return ResponseEntity.ok(createdUser);
        }
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User usuario) {
        usuario.setId(id);
        return userService.save(usuario);
    }

    @DeleteMapping("/{usuarioId}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
