package com.farmacia.luiz.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutosDto(

        @NotBlank(message = "Não é possível salvar o produto sem o nome")
        String nmProduto,
        @NotBlank(message = "Não é possível salvar o produto sem descrição")
        String dsBula,
        @NotNull(message = "Não é possível salvar o produto sem preço")
        @DecimalMin(value = "0.01", message = "Não é possível salvar o produto com preço menor que R$0.01")
        double vlProduto
) {
}
