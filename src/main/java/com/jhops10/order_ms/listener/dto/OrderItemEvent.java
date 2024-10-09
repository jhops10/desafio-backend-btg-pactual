package com.jhops10.order_ms.listener.dto;

import java.math.BigDecimal;

public record OrderItemEvent(String product,
                             Integer quantity,
                             BigDecimal price) {
}
