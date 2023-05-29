package com.pruebatecnicaingeneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnicaingeneo.entities.Vehiculo;
import com.pruebatecnicaingeneo.repository.VehiculoRepository;
import com.pruebatecnicaingeneo.services.VehiculoService;

@Service
public class VehiculoServiceImp  implements VehiculoService{
	
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public List<Vehiculo> listarVehiculo() {
		return vehiculoRepository.findAll();
	}

	
}
