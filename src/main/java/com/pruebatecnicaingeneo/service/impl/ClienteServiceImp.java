package com.pruebatecnicaingeneo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebatecnicaingeneo.entities.Cliente;
import com.pruebatecnicaingeneo.repository.ClienteRepository;
import com.pruebatecnicaingeneo.services.ClienteService;

@Service
public class ClienteServiceImp implements ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listAllClientes() {
	return clienteRepository.findAll();
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {
	return clienteRepository.save(cliente);
	}

}
