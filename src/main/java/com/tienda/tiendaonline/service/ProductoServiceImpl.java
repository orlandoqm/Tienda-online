package com.tienda.tiendaonline.service;

import com.tienda.tiendaonline.model.Producto;
import com.tienda.tiendaonline.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> get(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);
    }



    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }

    @Override
    public List<Producto> getAll() {
        return productoRepository.findAll();
    }
}
