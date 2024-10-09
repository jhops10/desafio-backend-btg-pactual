package com.jhops10.order_ms.listener.dto;

import com.jhops10.order_ms.entity.OrderItem;

import java.util.List;

public record OrderCreatedEvent(Long codigoPedido,
                                Long codigoCliente,
                                List<OrderItemEvent> itens) {
}
