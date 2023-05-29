package com.pruebatecnicaingeneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnicaingeneo.entities.Flota;
import com.pruebatecnicaingeneo.repository.FlotaRepository;
import com.pruebatecnicaingeneo.services.FlotaService;

@Service
public class FlotaServiceImp implements FlotaService {
	
	@Autowired
	private FlotaRepository flotaRepository;

	@Override
	public List<Flota> listarFlotas() {
		return flotaRepository.findAll();
	}

}
