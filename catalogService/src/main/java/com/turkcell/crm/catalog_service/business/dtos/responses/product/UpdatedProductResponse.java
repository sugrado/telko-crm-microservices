package com.turkcell.crm.catalog_service.business.dtos.responses.product;

import java.time.LocalDateTime;

public record UpdatedProductResponse(
        int id,
        LocalDateTime createdDate,
        LocalDateTime updatedDate,
        String title,
        String description,
        double price,
        int unitsInStock
) {
}
