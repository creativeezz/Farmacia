package com.farmacia.luiz.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmpresaDto(
        @NotBlank(message = "Nome da empresa não pode ser vazio")
        String nomeEmpresa,
        @NotBlank(message = "CNPJ não pode ser vazio")
        String cnpjEmpresa,
        @NotBlank(message = "Telefone da empresa não pode ser vazio")
        String telEmpresa,
        @NotBlank(message = "Endereço da empresa não pode ser vazio")
        String enderecoEmpresa,
        @NotBlank(message = "Email não pode ser vazio ou email inválido")
        @Email
        String emailEmpresa
) {
}
