package com.pruebatecnicaingeneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnicaingeneo.entities.TipoIdentificacion;
import com.pruebatecnicaingeneo.repository.TipoIdentificacionRepository;
import com.pruebatecnicaingeneo.services.TipoIdentificacionService;

@Service
public class TipoIdentificacionServiceImp  implements TipoIdentificacionService{
	
	@Autowired
	private TipoIdentificacionRepository tipoIdentificacionRepository;

	@Override
	public List<TipoIdentificacion> listarTipoIdentificacion() {
		return tipoIdentificacionRepository.findAll();
	}

}
