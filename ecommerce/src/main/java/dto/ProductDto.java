package dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class ProductDto {
    private UUID id;
    
    @NotBlank(message = "Product name is required")
    private String name;
    
    @NotBlank(message = "Product description is required")
    private String description;
    
    @Positive(message = "Cannot be negative")
    private BigDecimal price;
    
    @PositiveOrZero(message = "Cannot be negative")
    private Integer quantity;
    
    private String image; //add image
    
    private List<CommentDto> comments;
}
