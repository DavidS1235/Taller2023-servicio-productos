package com.example.demo.service;

import com.example.demo.model.entity.Producto;

import java.util.List;


public interface IProductoService {
    public List<Producto> findAll();

    public Producto findBycodProd(String codProd);

    public List<Producto> findBycodCateg(String codCateg);

    public void createProduct(Producto producto);

    public void updateProduct(Long Id, Producto producto);

    public void deleteProduct(Long Id);
}
