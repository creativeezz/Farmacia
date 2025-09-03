package com.farmacia.luiz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "TBPRODUTOS")
public class ProdutosModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDPRODUTO")
    private Integer cdProduto;
    @Column(name = "NMPRODUTO")
    private String nmProduto;
    @Column(name = "DSBULA")
    private String dsBula;
    @Column(name = "VLPRODUTO")
    private double vlProduto;
}