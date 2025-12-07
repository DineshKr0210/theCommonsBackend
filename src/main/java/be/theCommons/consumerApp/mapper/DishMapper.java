package be.theCommons.consumerApp.mapper;

import be.theCommons.consumerApp.dto.DishDTO;
import be.theCommons.consumerApp.model.Dish;

import java.util.stream.Collectors;

public class DishMapper {
    public static DishDTO toDTO(Dish dish) {
        if (dish == null) return null;
        return DishDTO.builder()
                .id(dish.getId() != null ? Long.valueOf(dish.getId()) : null)
                .name(dish.getDishName())
                .description(dish.getDescription())
                .price(dish.getPrice())
                .category(dish.getCategory() != null ? dish.getCategory().getName() : null)
                .calories(dish.getCalories()!= null ? dish.getCalories() : null)
                .imageUrl(dish.getImageUrl()!= null ? dish.getImageUrl() : null)
                .types(
                dish.getTypes().stream()
                        .map(TypeMapper::toDTO)
                        .collect(Collectors.toList())
        )
                .build();
    }
}