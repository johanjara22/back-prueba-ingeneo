package com.pruebatecnicaingeneo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehiculo {

	
	@Id
	private Integer idVehiculo;
	
    @Column(length=6)
	private String placa;

	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	
}
