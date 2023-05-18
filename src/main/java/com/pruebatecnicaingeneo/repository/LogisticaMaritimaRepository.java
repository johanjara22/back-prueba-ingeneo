package com.pruebatecnicaingeneo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebatecnicaingeneo.entities.LogisticaMaritima;


@Repository
public interface LogisticaMaritimaRepository extends JpaRepository<LogisticaMaritima, Long> {

}
