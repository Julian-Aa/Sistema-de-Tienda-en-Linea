package com.eam.controller;

import com.eam.models.Producto;
import com.eam.models.Usuario;
import com.eam.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping("")
    public void show(Model model){
    model.addAttribute("productos",productoService.findAll())
    }
    @GetMapping("/create")
    public String create(){
        return null;
    }

    @PostMapping("/save")
    public String save(Producto producto) {
        productoService.save(producto);
        Usuario u = new Usuario(1,"","","","","","","");
        producto.setUsuario(u);
        return "redirect:/productos";
    }
}
