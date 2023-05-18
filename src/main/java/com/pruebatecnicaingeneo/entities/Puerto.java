package com.pruebatecnicaingeneo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Puerto {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer IdPuerto;
	
	private String nombrePuerto;

	public Integer getIdPuerto() {
		return IdPuerto;
	}

	public void setIdPuerto(Integer idPuerto) {
		IdPuerto = idPuerto;
	}

	public String getNombrePuerto() {
		return nombrePuerto;
	}

	public void setNombrePuerto(String nombrePuerto) {
		this.nombrePuerto = nombrePuerto;
	}
	
	
}
