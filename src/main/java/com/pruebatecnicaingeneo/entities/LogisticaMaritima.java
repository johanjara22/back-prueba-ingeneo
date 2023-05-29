package com.pruebatecnicaingeneo.entities;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class LogisticaMaritima {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_logistica_maritima")
	private Long idLogisticaMaritima;
	
	private Integer cantidadProducto;
	
	@Column(nullable = false, updatable = false,name="fecha_registro")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date fechaRegistro;
	
	
	@Column(nullable = false, updatable = false,name="fecha_entrega")
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date fechaEntrega;
	
	@OneToOne()
	@JoinColumn(name = "flota", updatable = false, nullable = false)
	private Flota flota;
	
	@Column(name="precio_envio")
	private BigDecimal precioEnvio;
	
	@OneToOne()
	@JoinColumn(name = "puerto", updatable = false, nullable = false)
	private Puerto puerto;

	private String numeroGuia;
	
	@OneToOne()
	@JoinColumn(name = "cliente", updatable = false, nullable = false)
	private Cliente cliente;

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getIdLogisticaMaritima() {
		return idLogisticaMaritima;
	}

	public void setIdLogisticaMaritima(Long idLogisticaMaritima) {
		this.idLogisticaMaritima = idLogisticaMaritima;
	}

	public Integer getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(Integer cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Flota getFlota() {
		return flota;
	}

	public void setFlota(Flota flota) {
		this.flota = flota;
	}

	public BigDecimal getPrecioEnvio() {
		return precioEnvio;
	}

	public void setPrecioEnvio(BigDecimal precioEnvio) {
		this.precioEnvio = precioEnvio;
	}

	public Puerto getPuerto() {
		return puerto;
	}

	public void setPuerto(Puerto puerto) {
		this.puerto = puerto;
	}

	public String getNumeroGuia() {
		return numeroGuia;
	}

	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = numeroGuia;
	}



	
}
