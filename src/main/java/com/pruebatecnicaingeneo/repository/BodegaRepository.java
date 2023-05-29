package com.pruebatecnicaingeneo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnicaingeneo.entities.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer> {

}
