package com.example.demo.controller;

import com.example.demo.model.entity.Producto;
import com.example.demo.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private IProductoService service;

    @GetMapping("/listar-productos")
    public List<Producto> listar() {
        return service.findAll();
    }

    @GetMapping("/listar-productos/code")
    public Producto buscarPorcodProd(@RequestParam String codProd) {
        return service.findBycodProd(codProd);
    }

    @GetMapping("/listar-productos/category")
    public List<Producto> buscarPorcodCateg(@RequestParam String codCateg) {
        return service.findBycodCateg(codCateg);
    }

    @RequestMapping(value = "/productos/create", method = RequestMethod.POST)
    public void addProducto(
            @RequestBody Producto producto) {
        service.createProduct(producto);
    }

    @RequestMapping(value = "/productos/{id}", method = RequestMethod.PUT)
    public void updateProducto(
            @RequestBody Producto producto,
            @PathVariable Long id) {
        service.updateProduct(id, producto);
    }

    @RequestMapping(value = "/productos/{id}", method = RequestMethod.DELETE)
    public void deleteProducto(
            @PathVariable Long id) {
        service.deleteProduct(id);
    }

}
