package com.farmacia.luiz.repository;

import com.farmacia.luiz.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel, Integer> {
    Optional<ProdutosModel> findByCdProduto(int cdProduto);
    Optional<ProdutosModel> findAllByCdProduto(int cdProduto);
}
