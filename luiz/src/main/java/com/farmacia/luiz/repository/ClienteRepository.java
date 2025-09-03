package com.farmacia.luiz.repository;

import com.farmacia.luiz.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {
    Optional<ClienteModel> findByCdCliente(int cdCliente);
    Optional<ClienteModel> findAllByCdCliente(int cdCliente);
}
