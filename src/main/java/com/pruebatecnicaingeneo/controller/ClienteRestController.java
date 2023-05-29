package com.pruebatecnicaingeneo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnicaingeneo.entities.Bodega;
import com.pruebatecnicaingeneo.entities.Cliente;
import com.pruebatecnicaingeneo.entities.LogisticaTerrestre;
import com.pruebatecnicaingeneo.services.ClienteService;

@RestController
@RequestMapping("api/cliente")
@CrossOrigin(origins = {"http://localhost:4200","https://localhost:4200"})
public class ClienteRestController {
	@Autowired
	private ClienteService clienteService;

	
	@GetMapping("getAll")
	public ResponseEntity<List<Cliente>> getAllClientes() {
		return new ResponseEntity<List<Cliente>>(clienteService.listAllClientes(),HttpStatus.ACCEPTED);

	}
	
	@PostMapping("save")
	public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente){
		return new ResponseEntity<Cliente>(clienteService.saveCliente(cliente),HttpStatus.ACCEPTED);
	}
}
