package com.pruebatecnicaingeneo.services;

import java.util.List;

import com.pruebatecnicaingeneo.entities.LogisticaMaritima;

public interface LogisticaMaritimaService {
	  List<LogisticaMaritima> listAllLogisticaMaritima();

	  LogisticaMaritima getLogisticaMaritimaById(Long id);

	  LogisticaMaritima saveLogisticaMaritima(LogisticaMaritima logisticaMaritima);

	    void deleteLogisticaMaritima(Long id);
}
