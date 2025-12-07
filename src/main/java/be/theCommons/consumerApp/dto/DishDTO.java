package be.theCommons.consumerApp.dto;

import be.theCommons.consumerApp.model.enums.DishType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DishDTO {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer calories; // NULL allowed
    private String imageUrl;
    private String category;
    private List<TypeDTO> types;
}