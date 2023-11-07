package com.eam.controller;

import com.cloudinary.utils.ObjectUtils;
import com.eam.config.CloudinaryConfig;
import com.eam.models.Producto;
import com.eam.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {
    private String imagen = "";

    @Autowired
    private ProductoService productoService;
    @Autowired
    private CloudinaryConfig cloudc;

    @GetMapping
    public ResponseEntity<List<Producto>> show() {
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

    @GetMapping("/search")
    public ResponseEntity<List<Producto>> searchProducts(@RequestParam String searchTerm) {
        List<Producto> products = productoService.searchProducts(searchTerm);
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity<Producto> create(@RequestBody Producto producto) {
        producto.setImage(imagen);
        Producto createdProduct = productoService.save(producto);
        return ResponseEntity.ok(createdProduct);

    }

    @PostMapping("/image-rest")
    public String addProducto(@RequestParam("file") MultipartFile file) {
        System.out.println("SI ESTA ENTRANDO");
        try {
            Map uploadResult = cloudc.upload(file.getBytes(), ObjectUtils.asMap("resourcetype", "auto"));
            System.out.println(uploadResult.get("url").toString());
            imagen = uploadResult.get("url").toString();
            return uploadResult.get("url").toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "SI ";
    }

    @PutMapping("/{id}")
    public Producto update(@PathVariable Long id, @RequestBody Producto producto) {
        producto.setProductoId(id);
        if(imagen != "") {
            producto.setImage(imagen);
        }
        return productoService.save(producto);
    }

    @DeleteMapping("/{productoId}")
    public ResponseEntity<String> delete(@PathVariable Long productoId) {
        productoService.deleteById(productoId);
        return ResponseEntity.noContent().build();
    }
}
