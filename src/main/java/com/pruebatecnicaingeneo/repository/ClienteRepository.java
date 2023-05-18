package com.pruebatecnicaingeneo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.pruebatecnicaingeneo.entities.Cliente;




public interface ClienteRepository  extends JpaRepository<Cliente, String>{

}
