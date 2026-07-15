package com.zagrebopenfestivals.dto.response;

import java.math.BigDecimal;

/**
 * DTO je gotov
 */
public record DrinkResponse(
        Long id,
        String name,
        BigDecimal price
) {
}
