package com.pruebatecnicaingeneo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Guia {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idGuia;
	
	private String numeroGuia;

	public Integer getIdGuia() {
		return idGuia;
	}

	public void setIdGuia(Integer idGuia) {
		this.idGuia = idGuia;
	}

	public String getNumeroGuia() {
		return numeroGuia;
	}

	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = numeroGuia;
	}
	
	
	
	
}
