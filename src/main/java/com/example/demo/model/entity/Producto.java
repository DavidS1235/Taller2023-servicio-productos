package com.example.demo.model.entity;



import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "productos")
@Data
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private String codProd;
    private String codCateg;
    private String nombreProd;
    private String marca;
    private Integer stockProd;
    private double precUnit;
    private String descripcion;

}
