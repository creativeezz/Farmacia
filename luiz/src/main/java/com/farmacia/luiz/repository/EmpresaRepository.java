package com.farmacia.luiz.repository;

import com.farmacia.luiz.model.EmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<EmpresaModel, Integer> {
    Optional<EmpresaModel> findByIdEmpresa(int idEmpresa);
    Optional<EmpresaModel> findAllByIdEmpresa(int idEmpresa);
}
