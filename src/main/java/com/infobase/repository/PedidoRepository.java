package com.infobase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infobase.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
