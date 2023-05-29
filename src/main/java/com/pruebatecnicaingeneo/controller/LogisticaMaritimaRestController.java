package com.pruebatecnicaingeneo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebatecnicaingeneo.entities.LogisticaMaritima;
import com.pruebatecnicaingeneo.services.LogisticaMaritimaService;

@RestController
@RequestMapping("api/logisticaMar")
@CrossOrigin(origins = {"http://localhost:4200","https://localhost:4200"})
public class LogisticaMaritimaRestController {
	
	@Autowired
	private LogisticaMaritimaService logisticaMaritimaService;
	
	
	@GetMapping("getAll")
	public ResponseEntity<List<LogisticaMaritima>> getAllLogisticasMaritimas() {
		return new ResponseEntity<List<LogisticaMaritima>>(logisticaMaritimaService.listAllLogisticaMaritima(),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getLogisticaMaritima/{IdLogistica}")
	public ResponseEntity<LogisticaMaritima> getLogisticasMaritimaById(@PathVariable Long IdLogistica ) {
		return new ResponseEntity<LogisticaMaritima>(logisticaMaritimaService.getLogisticaMaritimaById(IdLogistica),HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("save")
	public ResponseEntity<LogisticaMaritima> saveLogisticaMaritima(@RequestBody LogisticaMaritima logisticaMaritima){
		return new ResponseEntity<LogisticaMaritima>(logisticaMaritimaService.saveLogisticaMaritima(logisticaMaritima),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("delete/{IdLogistica}")
	public void deleteById(@PathVariable Long IdLogistica) {
		logisticaMaritimaService.deleteLogisticaMaritima(IdLogistica);
	}
	
}
