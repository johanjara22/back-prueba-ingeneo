package com.pruebatecnicaingeneo.services;

import java.util.List;


import com.pruebatecnicaingeneo.entities.LogisticaTerrestre;

public interface LogisticaTerrestreService {
	
	 List<LogisticaTerrestre> listAllLogisticaTerrestre();

	 LogisticaTerrestre getLogisticaTerrestreById(Long id);

	 LogisticaTerrestre saveLogisticaTerrestre(LogisticaTerrestre logisticaTerrestre);

	    void deleteLogisticaTerrestre(Long id);

}
