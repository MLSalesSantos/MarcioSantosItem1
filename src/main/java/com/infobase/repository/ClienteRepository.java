package com.infobase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infobase.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	@Query(value = "SELECT Cliente.nome, Pedido.valor_total, Cliente.data_ultimo_acesso FROM Cliente, Pedido "
	+ " WHERE Cliente.id = Pedido.id_cliente ORDER BY Pedido.valor_total DESC")
	List<Cliente> findAllClientes();
	
}
