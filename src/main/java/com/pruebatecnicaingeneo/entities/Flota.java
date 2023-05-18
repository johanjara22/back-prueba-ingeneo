package com.pruebatecnicaingeneo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flota {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idFlota;
	
	
	@Column(length=8)
	private String numeroFlota;

	public Integer getIdFlota() {
		return idFlota;
	}

	public void setIdFlota(Integer idFlota) {
		this.idFlota = idFlota;
	}

	public String getNumeroFlota() {
		return numeroFlota;
	}

	public void setNumeroFlota(String numeroFlota) {
		this.numeroFlota = numeroFlota;
	}
	
	
	
	
}
