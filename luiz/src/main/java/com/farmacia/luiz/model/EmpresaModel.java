package com.farmacia.luiz.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "TBEMPRESA")
public class EmpresaModel {
    /*
     * criar uma api de empresa
     * id da empresa
     * nome da empresa
     * cnpj da empresa
     * telefone da empresa
     * endereco da empresa
     * email da empresa
     */

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmpresa")
    private Integer idEmpresa;
    @Column(name = "nomeEmpresa")
    private String nomeEmpresa;
    @Column(name = "cnpjEmpresa")
    private String cnpjEmpresa;
    @Column(name = "telEmpresa")
    private String telEmpresa;
    @Column(name = "enderecoEmpresa")
    private String enderecoEmpresa;
    @Column(name = "emailEmpresa")
    private String emailEmpresa;
}
