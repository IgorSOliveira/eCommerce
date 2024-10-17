package dto;

import java.util.List;
import java.util.UUID;

public class CartDto {
    private UUID id;
    
    private UUID userId; //usedId
    
    private List<CartItemDto> items;
}
