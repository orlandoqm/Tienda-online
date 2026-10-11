package com.tienda.tiendaonline.service;

import com.tienda.tiendaonline.model.Producto;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    public Producto save(Producto producto);
    public Optional<Producto> get(Integer id);
    public void update(Producto producto);
    public void delete(Integer id);
    public List<Producto> getAll();
}
