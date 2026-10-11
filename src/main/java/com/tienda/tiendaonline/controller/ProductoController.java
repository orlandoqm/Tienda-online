package com.tienda.tiendaonline.controller;

import com.tienda.tiendaonline.model.Producto;
import com.tienda.tiendaonline.model.Usuario;
import com.tienda.tiendaonline.service.ProductoService;
import org.slf4j.ILoggerFactory;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public String show(Model model) {
        model.addAttribute("productos", productoService.getAll());
        return "productos/show";
    }

    @GetMapping("create")
    public String create() {
        return "productos/create";
    }

    @PostMapping("/save")
    public String save(Producto producto){
        LOGGER.info("Datos del objeto producto creado " + producto);
        Usuario usuario = new Usuario(1,"","","","","","","");
        producto.setUsuario(usuario);
        productoService.save(producto);
        return "redirect:/productos";
    }
}
