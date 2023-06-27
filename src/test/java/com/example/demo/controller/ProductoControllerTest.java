package com.example.demo.controller;

import com.example.demo.model.entity.Producto;
import com.example.demo.service.IProductoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProductoControllerTest {

    @Mock
    private IProductoService service;

    @InjectMocks
    private ProductoController controller;

    @Test
    void listarporCodigo() {

        //Arrange
        String code = "P00001";
        Producto p1 = new Producto();

        //Act
        Mockito.when(service.findBycodProd(code))
                .thenReturn(p1);

        Producto res = controller.buscarPorcodProd(code);

        //Assert
        Mockito.verify(service, Mockito.times(1))
                .findBycodProd(code);

        Assertions.assertEquals(p1,res);
    }
}