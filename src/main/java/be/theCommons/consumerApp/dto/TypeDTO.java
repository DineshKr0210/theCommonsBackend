package be.theCommons.consumerApp.dto;

import be.theCommons.consumerApp.model.enums.DishType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TypeDTO {
    private Long id;
    private DishType name;
}