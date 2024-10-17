package dto;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class ProductListDto {
    private UUID id;
    
    @NotBlank(message = "Name is required")
    private String name;
    
    @NotBlank(message = "Description is required")
    private String description;
    
    @Positive(message = "Price must be positive")
    private BigDecimal price;
    
    @PositiveOrZero(message = "Qunatity must be positive or zero")
    private Integer quantity;
    
    private String image;

	public ProductListDto(UUID id, @NotBlank(message = "Name is required") String name,
			@NotBlank(message = "Description is required") String description,
			@Positive(message = "Price must be positive") BigDecimal price,
			@PositiveOrZero(message = "Qunatity must be positive or zero") Integer quantity, String image) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.image = image;
	}
    
    
}
