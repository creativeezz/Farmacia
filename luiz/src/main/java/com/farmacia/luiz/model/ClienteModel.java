package com.farmacia.luiz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "TBCLIENTES")
public class ClienteModel {

    /*
    * Criar uma API de cliente.
    *
    * id do cliente
    * nome do cliente
    * cpf do cliente
    * telefone do cliente
    * email do cliente
    *
     */

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDCLIENTE")
    private Integer cdCliente;
    @Column(name = "NMCLIENTE")
    private String nmCliente;
    @Column(name = "CPFCLIENTE")
    private String cpfCliente;
    @Column(name = "TELCLIENTE")
    private String telCliente;
    @Column(name = "EMAILCLIENTE")
    private String emailCliente;
}