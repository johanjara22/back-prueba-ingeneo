package com.pruebatecnicaingeneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnicaingeneo.entities.Puerto;
import com.pruebatecnicaingeneo.repository.PuertoRepository;
import com.pruebatecnicaingeneo.services.PuertoService;

@Service
public class PuertoServiceImp implements PuertoService{
	@Autowired
	private PuertoRepository puertoRepository;

	@Override
	public List<Puerto> listarPuertos() {
		return puertoRepository.findAll();
	}

}
