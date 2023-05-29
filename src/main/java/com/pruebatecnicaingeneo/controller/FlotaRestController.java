package com.pruebatecnicaingeneo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebatecnicaingeneo.entities.Flota;
import com.pruebatecnicaingeneo.services.FlotaService;

@RestController
@RequestMapping("api/flota")
@CrossOrigin(origins = {"http://localhost:4200","https://localhost:4200"})
public class FlotaRestController {

	@Autowired 
	private FlotaService flotaService;
	
	@GetMapping("getAll")
	public ResponseEntity<List<Flota>> getAllFlotas() {
		return new ResponseEntity<List<Flota>>(flotaService.listarFlotas(),HttpStatus.ACCEPTED);
	}
}
