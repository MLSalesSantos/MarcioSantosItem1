package com.infobase.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infobase.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	@Query(value = " FROM Cliente, Pedido "
				 + " WHERE Cliente.id = Pedido.id_cliente ORDER BY Pedido.valor_total DESC")
	List<Cliente> findAllClientes(String nome, BigDecimal valor_total, LocalDate data_ultimo_acesso);
	
}
