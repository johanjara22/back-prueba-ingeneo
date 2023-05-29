package com.pruebatecnicaingeneo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebatecnicaingeneo.entities.Puerto;
import com.pruebatecnicaingeneo.services.PuertoService;

@RestController
@RequestMapping("api/puerto")
@CrossOrigin(origins = {"http://localhost:4200","https://localhost:4200"})
public class PuertoRestController {
	
	@Autowired 
	private PuertoService puertoService;

	@GetMapping("getAll")
	public ResponseEntity<List<Puerto>> getAllPuertos() {
		return new ResponseEntity<List<Puerto>>(puertoService.listarPuertos(),HttpStatus.ACCEPTED);
	}
}
