package com.pruebatecnicaingeneo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnicaingeneo.entities.Vehiculo;
@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {

}
