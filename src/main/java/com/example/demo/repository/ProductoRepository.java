package com.example.demo.repository;

import com.example.demo.model.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {


    Optional<Producto> findBycodProd(String codProd);

    List<Producto> findBycodCateg(String codCateg);

}
