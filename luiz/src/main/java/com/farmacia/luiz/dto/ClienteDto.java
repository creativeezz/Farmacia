package com.farmacia.luiz.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record ClienteDto(
        @NotBlank(message = "Não é possível salvar o cliente sem o nome")
        @Size (min = 2, max = 100, message = "O nome do cliente deve ter entre 2 e 100 caracteres")
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
