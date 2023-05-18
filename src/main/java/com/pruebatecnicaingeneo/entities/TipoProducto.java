package com.pruebatecnicaingeneo.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TipoProducto {

	@Id
	@Column(name="id_tipo_producto")
	private Integer idTipoProducto;
	
	private String nombreProducto;
	
	 @ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "logistica_terrestre", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  @JsonIgnore
	  private LogisticaTerrestre logisticaTerrestre;

	public Integer getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(Integer idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	
	
	
}
