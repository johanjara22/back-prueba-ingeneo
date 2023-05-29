package com.pruebatecnicaingeneo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebatecnicaingeneo.entities.TipoProducto;
import com.pruebatecnicaingeneo.services.TipoProductoService;

@RestController
@RequestMapping("api/tipoProducto")
@CrossOrigin(origins = {"http://localhost:4200","https://localhost:4200"})
public class TipoProductoRestController {
	@Autowired 
	private TipoProductoService tipoProductoService;

	@GetMapping("getAll")
	public ResponseEntity<List<TipoProducto>> getAllTipoProductos() {
		return new ResponseEntity<List<TipoProducto>>(tipoProductoService.listarTipoTipoProducto(),HttpStatus.ACCEPTED);
	}

}
