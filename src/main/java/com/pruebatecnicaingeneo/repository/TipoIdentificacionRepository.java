package com.pruebatecnicaingeneo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnicaingeneo.entities.TipoIdentificacion;
@Repository
public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer> {

}
