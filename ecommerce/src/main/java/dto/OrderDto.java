package dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import entity.Order;
import jakarta.validation.constraints.NotBlank;

public class OrderDto {
    
	private UUID id;
    
	private UUID userId;
    
	@NotBlank(message = "Address is required")
    private String address;
    
	@NotBlank(message = "Phone name is required")
    private String phoneNumber;
    
	private Order.OrderStatus status;
    
	private LocalDateTime createdAt;
    
	private List<OrderItemDto> orderItems;
}
