package com.farmacia.luiz.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record ClienteDto(
        @NotBlank(message = "Não é possível salvar o cliente sem o nome")
        String nmCliente,
        @NotBlank(message = "Não é possível salvar o cliente sem o CPF")
        @Pattern(regexp="\\d{11}")
        String cpfCliente,
        @NotBlank(message = "Não é possível salvar o cliente sem o telefone")
        String telCliente,
        @NotBlank(message = "Não é possível salvar o cliente sem o email")
        @Email
        String emailCliente
) {
}
