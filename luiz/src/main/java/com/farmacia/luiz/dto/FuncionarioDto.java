package com.farmacia.luiz.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record FuncionarioDto(
        @NotBlank(message = "Não é possível salvar funcionario sem nome")
        String nmFuncionario,
        @NotBlank(message = "Não é possivel salvar funcionario sem cpf")
        @Pattern(regexp="\\d{11}")
        String cpfFuncionario,
        @NotBlank(message = "Não é possivel salvar funcionario sem telefone")
        String telFuncionario,
        @NotBlank(message = "Não é possivel salvar funcionario sem email")
        @Email
        String emailFuncionario,
        @NotBlank(message = "Não é possivel salvar funcionario sem salario")
        Double salarioFuncionario,
        @NotBlank(message = "Não é possivel salvar funcionario sem cargo")
        String cargoFuncionario,
        @NotBlank(message = "Não é possivel salvar funcionario sem codigo do cargo")
        Integer codigoCargoFuncionario
) {
}
