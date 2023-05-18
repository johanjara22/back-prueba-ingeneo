package com.pruebatecnicaingeneo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bodega {

		@Id 
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer idBodega;
	
		private String nombreBodega;
	
		public Integer getIdBodega() {
			return idBodega;
		}
	
		public void setIdBodega(Integer idBodega) {
			this.idBodega = idBodega;
		}
	
		public String getNombreBodega() {
			return nombreBodega;
		}
	
		public void setNombreBodega(String nombreBodega) {
			this.nombreBodega = nombreBodega;
		}
		

}
