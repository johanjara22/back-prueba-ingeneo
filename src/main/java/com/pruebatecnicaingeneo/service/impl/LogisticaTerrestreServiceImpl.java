package com.pruebatecnicaingeneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnicaingeneo.entities.LogisticaTerrestre;
import com.pruebatecnicaingeneo.repository.LogisticaTerrestreRepository;
import com.pruebatecnicaingeneo.services.LogisticaTerrestreService;

@Service
public class LogisticaTerrestreServiceImpl implements LogisticaTerrestreService {
	
	@Autowired
	private LogisticaTerrestreRepository terrestreService;

	@Override
	public List<LogisticaTerrestre> listAllLogisticaTerrestre() {
	return terrestreService.findAll();
	}

	@Override
	public LogisticaTerrestre getLogisticaTerrestreById(Long id) {
		return terrestreService.findById(id).orElse(null);
	}

	@Override
	public LogisticaTerrestre saveLogisticaTerrestre(LogisticaTerrestre logisticaTerrestre) {
		return terrestreService.save(logisticaTerrestre);
	}

	@Override
	public void deleteLogisticaTerrestre(Long id) {
		terrestreService.deleteById(id);
		
	}

}
