package com.pruebatecnicaingeneo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnicaingeneo.entities.Puerto;
@Repository
public interface PuertoRepository  extends JpaRepository<Puerto, Integer>{

}
