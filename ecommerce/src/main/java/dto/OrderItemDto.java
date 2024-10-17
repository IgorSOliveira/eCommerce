package dto;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.validation.constraints.Positive;

public class OrderItemDto {
    private UUID id;
    
    private UUID productId;
    
    @Positive
    private Integer quantity;
    
    @Positive
    private BigDecimal price;
}
