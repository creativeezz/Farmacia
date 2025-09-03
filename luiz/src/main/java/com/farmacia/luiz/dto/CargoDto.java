package com.farmacia.luiz.dto;

import jakarta.validation.constraints.NotBlank;

public record CargoDto(
        @NotBlank(message = "Nome do cargo não pode ser vazio")
        String nomeCargo
) {
}
