package com.pruebatecnicaingeneo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TipoIdentificacion {
	
	@Id
	@Column(name="id_tipo_identificacion")
	private Integer idTipoIdentificacion;

	private String nombreIdentificacion;

	public Integer getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}

	public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
	}

	public String getNombreIdentificacion() {
		return nombreIdentificacion;
	}

	public void setNombreIdentificacion(String nombreIdentificacion) {
		this.nombreIdentificacion = nombreIdentificacion;
	}
	
	
}
