package com.farmacia.luiz.dto;

import jakarta.validation.constraints.*;

public record FuncionarioDto(
        @NotBlank(message = "Não é possível salvar funcionario sem nome")
        @Size(min = 2, max = 100, message = "O nome do cliente deve ter entre 2 e 100 caracteres")
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
        @DecimalMin(value = "1514", message = "Não pode inserir um valor menor, pois é abaixo do salario minimo")
        Double salarioFuncionario,

        @NotBlank(message = "Não é possivel salvar funcionario sem cargo")
        String cargoFuncionario,

        @NotBlank(message = "Não é possivel salvar funcionario sem codigo do cargo")
        Integer codigoCargoFuncionario
) {
}
