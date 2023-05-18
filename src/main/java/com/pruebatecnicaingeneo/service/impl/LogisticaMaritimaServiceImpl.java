package com.pruebatecnicaingeneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnicaingeneo.entities.LogisticaMaritima;
import com.pruebatecnicaingeneo.repository.LogisticaMaritimaRepository;
import com.pruebatecnicaingeneo.services.LogisticaMaritimaService;

@Service
public class LogisticaMaritimaServiceImpl implements LogisticaMaritimaService{

	@Autowired
	private LogisticaMaritimaRepository maritimaRepository;
	
	@Override
	public List<LogisticaMaritima> listAllLogisticaMaritima() {
		return maritimaRepository.findAll();
	}

	@Override
	public LogisticaMaritima getLogisticaMaritimaById(Long id) {
		return maritimaRepository.findById(id).orElse(null);
	}

	@Override
	public LogisticaMaritima saveLogisticaMaritima(LogisticaMaritima logisticaMaritima) {
	 return maritimaRepository.save(logisticaMaritima);
	}

	@Override
	public void deleteLogisticaMaritima(Long id) {
		maritimaRepository.deleteById(id);
		
	}

	
	
}
