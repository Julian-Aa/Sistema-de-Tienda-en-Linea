package com.eam.controller;

import com.eam.models.Producto;
import jakarta.servlet.http.HttpServlet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class demoControler {

    @RequestMapping(value = "producto",method = RequestMethod.GET)
    public Producto obtenerProducto(){
    Producto producto = new Producto();
    producto.setProductoId(12);
    producto.setCantidad(21);
    producto.setNombre("sdf");
    producto.setPrecio("3242");
    return producto;
    }

}
