package com.turkcell.crm.order_service.business.dtos.responses;

public record GetAllOrdersByAccountIdResponse(
        int productId,
        String productName
) {
}
