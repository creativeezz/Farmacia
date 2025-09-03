package com.farmacia.luiz.repository;

import com.farmacia.luiz.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Integer> {
    Optional<FuncionarioModel> findByCdFuncionario(int cdFuncionario);
    Optional<FuncionarioModel> findAllByCdFuncionario(int cdFuncionario);
}
