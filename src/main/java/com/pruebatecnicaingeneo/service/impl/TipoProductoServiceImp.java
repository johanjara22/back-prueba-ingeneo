package com.pruebatecnicaingeneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnicaingeneo.entities.TipoProducto;
import com.pruebatecnicaingeneo.repository.TipoProductoRepository;
import com.pruebatecnicaingeneo.services.TipoProductoService;

@Service
public class TipoProductoServiceImp implements TipoProductoService {
	
	@Autowired
	private TipoProductoRepository tipoProductoRepository;

	@Override
	public List<TipoProducto> listarTipoTipoProducto() {
		return tipoProductoRepository.findAll();
	}

}
