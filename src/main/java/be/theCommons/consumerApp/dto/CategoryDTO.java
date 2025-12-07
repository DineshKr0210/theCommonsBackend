package be.theCommons.consumerApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import java.util.List;

// CATEGORY DTO
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)  // <-- This excludes null fields
public class CategoryDTO {
    private Long id;
    private String name;
    private String description;
    private List<DishDTO> dishes;
}