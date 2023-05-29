package com.pruebatecnicaingeneo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnicaingeneo.entities.TipoProducto;
@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProducto,Integer> {

}
