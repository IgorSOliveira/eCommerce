package dto;

import java.util.UUID;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class CommentDto {
    private UUID id;
    
    @NotBlank(message = "Content is required")
    private String content;
    
    @Min(value=1)
    @Max(value=5)
    private int score;
    
    private UUID userId;
}
