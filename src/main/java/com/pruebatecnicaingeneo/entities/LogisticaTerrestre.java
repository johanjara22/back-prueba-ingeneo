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
public class LogisticaTerrestre {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_logistica_terrestre")
	private Long idLogisticaTerrestre;
	
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
	@JoinColumn(name = "bodega", updatable = false, nullable = false)
	private Bodega bodega;
	
	@Column(name="precio_envio")
	private BigDecimal precioEnvio;
	
	@OneToOne()
	@JoinColumn(name = "vehiculo", updatable = false, nullable = false)
	private Vehiculo vehiculo;

	@OneToOne()
	@JoinColumn(name = "guia", updatable = false, nullable = false)
	private Guia guia;
	
	@OneToOne()
	@JoinColumn(name = "cliente", updatable = false, nullable = false)
	private Cliente cliente;
	
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getIdLogisticaTerrestre() {
		return idLogisticaTerrestre;
	}

	public void setIdLogisticaTerrestre(Long idLogisticaTerrestre) {
		this.idLogisticaTerrestre = idLogisticaTerrestre;
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

	public Bodega getBodega() {
		return bodega;
	}

	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}

	public BigDecimal getPrecioEnvio() {
		return precioEnvio;
	}

	public void setPrecioEnvio(BigDecimal precioEnvio) {
		this.precioEnvio = precioEnvio;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Guia getGuia() {
		return guia;
	}

	public void setGuia(Guia guia) {
		this.guia = guia;
	}
	
	
	
}
