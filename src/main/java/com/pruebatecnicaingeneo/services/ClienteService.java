package com.pruebatecnicaingeneo.services;

import java.util.List;

import com.pruebatecnicaingeneo.entities.Cliente;

public interface ClienteService {

	 List<Cliente> listAllClientes();

	 Cliente saveCliente(Cliente cliente);
}
