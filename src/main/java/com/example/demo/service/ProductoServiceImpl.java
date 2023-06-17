package com.example.demo.service;

import com.example.demo.model.entity.Producto;
import com.example.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductoRepository productoDao;
    @Override
    public List<Producto> findAll() {
        return productoDao.findAll();
    }

    @Override
    public Producto findBycodProd(String codProd) {
        return productoDao.findBycodProd(codProd)
                .orElse(null);
    }

    @Override
    public List<Producto> findBycodCateg(String codCateg) {
        return productoDao.findBycodCateg(codCateg);
    }

    public void createProduct(Producto producto) {
            productoDao.save(producto);
    }

    public void updateProduct(Long id, Producto producto) {
        productoDao.save(producto);
    }

    public void deleteProduct(Long id) {
        productoDao.deleteById(id);
    }

}
