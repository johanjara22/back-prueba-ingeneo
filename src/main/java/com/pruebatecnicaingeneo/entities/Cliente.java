package com.pruebatecnicaingeneo.entities;



import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity

public class Cliente {
	
	@Id
	@Column(name="identificacion",length = 10)
	private String numeroIdentificacion;
	
	@OneToOne()
	@JoinColumn(name = "tipo_identificacion", updatable = false, nullable = false)
	private TipoIdentificacion tipoIdentificacion;

	
	private String nombre;
	
	private String apellido;
	
	private String email;

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
