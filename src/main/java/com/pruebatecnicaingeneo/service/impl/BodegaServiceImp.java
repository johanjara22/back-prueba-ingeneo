package com.pruebatecnicaingeneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnicaingeneo.entities.Bodega;
import com.pruebatecnicaingeneo.repository.BodegaRepository;
import com.pruebatecnicaingeneo.services.BodegaService;

@Service
public class BodegaServiceImp implements BodegaService {
	@Autowired
	private BodegaRepository bodegaRepository;

	@Override
	public List<Bodega> listarBodegas() {
	 return bodegaRepository.findAll();
	}

}
