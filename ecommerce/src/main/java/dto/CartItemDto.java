package dto;

import java.util.UUID;

import jakarta.validation.constraints.Positive;

public class CartItemDto {
    private UUID id;
    
    private UUID productId;
    
    @Positive
    private Integer quantity;
}
