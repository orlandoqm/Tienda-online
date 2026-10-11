package com.tienda.tiendaonline.controller;

import com.tienda.tiendaonline.model.Producto;
import org.slf4j.ILoggerFactory;
import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);

    @GetMapping("")
    public String show() {

        return "productos/show";
    }

    @GetMapping("create")
    public String create() {
        return "productos/create";
    }

    @PostMapping("/save")
    public String save(Producto producto){
        LOGGER.info("Datos del objeto producto creado " + producto);
        return "redirect:/productos";
    }
}
