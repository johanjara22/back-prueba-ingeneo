package com.pruebatecnicaingeneo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebatecnicaingeneo.entities.TipoIdentificacion;
import com.pruebatecnicaingeneo.services.TipoIdentificacionService;

@RestController
@RequestMapping("api/tipoIdentificacion")
@CrossOrigin(origins = {"http://localhost:4200","https://localhost:4200"})
public class TipoIdentificacionRestController {

	@Autowired 
	private TipoIdentificacionService tipoIdentificacionService;

	@GetMapping("getAll")
	public ResponseEntity<List<TipoIdentificacion>> getAllTipoIdentificaciones() {
		return new ResponseEntity<List<TipoIdentificacion>>(tipoIdentificacionService.listarTipoIdentificacion(),HttpStatus.ACCEPTED);
	}
}
