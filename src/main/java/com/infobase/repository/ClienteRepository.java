package com.infobase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infobase.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
