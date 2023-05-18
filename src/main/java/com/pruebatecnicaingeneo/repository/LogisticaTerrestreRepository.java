package com.pruebatecnicaingeneo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnicaingeneo.entities.LogisticaTerrestre;

@Repository
public interface LogisticaTerrestreRepository  extends JpaRepository<LogisticaTerrestre, Long>{

}
