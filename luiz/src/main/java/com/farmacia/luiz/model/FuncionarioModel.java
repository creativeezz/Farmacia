package com.farmacia.luiz.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "TBFUNCIONARIOS")
public class FuncionarioModel {
    /*
     * criar uma API de funcionario.
     * id do funcionario
     * nome do funcionario
     * cpf do funcionario
     * telefone do funcionario
     * email do funcionario
     * salario do funcionario
     * cargo do funcionario
     * codigo do cargo do funcionario
     *
     *
     * */

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdFuncionario")
    private Integer cdFuncionario;
    @Column(name = "nmFuncionario")
    private String nmFuncionario;
    @Column(name = "cpfFuncionario")
    private String cpfFuncionario;
    @Column(name = "telFuncionario")
    private String telFuncionario;
    @Column(name = "emailFuncionario")
    private String emailFuncionario;
    @Column(name = "salarioFuncionario")
    private Double salarioFuncionario;
    @Column(name = "cargoFuncionario")
    private String cargoFuncionario;
    @Column(name = "codigoCargoFuncionario")
    private Integer codigoCargoFuncionario;
}
