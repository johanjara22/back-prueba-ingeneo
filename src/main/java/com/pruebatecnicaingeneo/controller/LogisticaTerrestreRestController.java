package com.pruebatecnicaingeneo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebatecnicaingeneo.entities.LogisticaTerrestre;
import com.pruebatecnicaingeneo.services.LogisticaTerrestreService;


@RestController
@RequestMapping("api/logisticaTerr")
public class LogisticaTerrestreRestController {
	@Autowired 
	private LogisticaTerrestreService logisticaTerrestreService;

	@GetMapping("getAll")
	public ResponseEntity<List<LogisticaTerrestre>> getAllLogisticasTerrestres() {
		return new ResponseEntity<List<LogisticaTerrestre>>(logisticaTerrestreService.listAllLogisticaTerrestre(),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getLogisticaTerrestre/{IdLogistica}")
	public ResponseEntity<LogisticaTerrestre> getLogisticasMaritimaById(@PathVariable Long IdLogistica ) {
		return new ResponseEntity<LogisticaTerrestre>(logisticaTerrestreService.getLogisticaTerrestreById(IdLogistica),HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("save")
	public ResponseEntity<LogisticaTerrestre> saveLogisticaMaritima(@RequestBody LogisticaTerrestre logisticaTerrestre){
		return new ResponseEntity<LogisticaTerrestre>(logisticaTerrestreService.saveLogisticaTerrestre(logisticaTerrestre),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("delete/{IdLogistica}")
	public void deleteById(@PathVariable Long IdLogistica) {
		logisticaTerrestreService.deleteLogisticaTerrestre(IdLogistica);
	}
}
