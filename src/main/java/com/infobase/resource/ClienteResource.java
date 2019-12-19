package com.infobase.resource;

import java.math.BigDecimal;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infobase.model.Cliente;
import com.infobase.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping
	public List<Cliente> find(
			 @RequestParam(defaultValue = "valorTotal") BigDecimal ordenacao,
		     @RequestParam(defaultValue = "DESC") Sort.Direction direcao ) {          
		return clienteRepository.findAll();
	}

}
