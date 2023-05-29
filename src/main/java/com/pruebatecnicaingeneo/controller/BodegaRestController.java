package com.pruebatecnicaingeneo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebatecnicaingeneo.entities.Bodega;
import com.pruebatecnicaingeneo.services.BodegaService;

@RestController
@RequestMapping("api/bodega")
@CrossOrigin(origins = {"http://localhost:4200","https://localhost:4200"})
public class BodegaRestController {
	
	@Autowired
	private BodegaService bodegaService;
	
	@GetMapping("getAll")
	public ResponseEntity<List<Bodega>> getAllBodegas() {
		return new ResponseEntity<List<Bodega>>(bodegaService.listarBodegas(),HttpStatus.ACCEPTED);
	}

}
