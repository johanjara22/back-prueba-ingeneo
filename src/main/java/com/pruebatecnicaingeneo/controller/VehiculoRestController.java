package com.pruebatecnicaingeneo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebatecnicaingeneo.entities.Vehiculo;
import com.pruebatecnicaingeneo.services.VehiculoService;

@RestController
@RequestMapping("api/vehiculo")
@CrossOrigin(origins = {"http://localhost:4200","https://localhost:4200"})
public class VehiculoRestController {

	@Autowired 
	private VehiculoService vehiculoService;

	@GetMapping("getAll")
	public ResponseEntity<List<Vehiculo>> getAllVehiculos() {
		return new ResponseEntity<List<Vehiculo>>(vehiculoService.listarVehiculo(),HttpStatus.ACCEPTED);
	}
}
