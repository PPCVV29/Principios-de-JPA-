package com.ug.hotels.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.ug.hotels.model.Producto;

public interface ProductoService {
    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    List<Producto> findByNombre(String nombre);
    List<Producto> findByPrecioRange(BigDecimal minPrecio, BigDecimal maxPrecio);
}