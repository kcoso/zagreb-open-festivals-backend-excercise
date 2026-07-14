package com.zagrebopenfestivals.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

/**
 * DTO je gotov
 */
public record DrinkRequest(

        @NotBlank(message = "Naziv je obavezan")
        String name,

        @NotNull(message = "Cijena je obavezna")
        @DecimalMin(value = "0.0", inclusive = true, message = "Cijena ne smije biti negativna")
        BigDecimal price
) {
}
