package com.pruebatecnicaingeneo.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


public class PlanEntrega {

	/*@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_entrega")
	private Long idEntrega;
	
	 	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	 	@JoinColumn(name = "cliente", nullable = false)
	 	@OnDelete(action = OnDeleteAction.CASCADE)
	 	@Nonnull
	 	private Cliente cliente;
	 
		@OneToOne()
		@JoinColumn(name = "logistica_terrestre", updatable = false, nullable = false)
		private LogisticaTerrestre logisticaTerrestre;

		@OneToOne()
		@JoinColumn(name = "logistica_maritima", updatable = false, nullable = false)
		private LogisticaMaritima logisticaMaritima;

		public Long getIdEntrega() {
			return idEntrega;
		}

		public void setIdEntrega(Long idEntrega) {
			this.idEntrega = idEntrega;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public LogisticaTerrestre getLogisticaTerrestre() {
			return logisticaTerrestre;
		}

		public void setLogisticaTerrestre(LogisticaTerrestre logisticaTerrestre) {
			this.logisticaTerrestre = logisticaTerrestre;
		}

		public LogisticaMaritima getLogisticaMaritima() {
			return logisticaMaritima;
		}

		public void setLogisticaMaritima(LogisticaMaritima logisticaMaritima) {
			this.logisticaMaritima = logisticaMaritima;
		}
		
		
		

*/	
}
