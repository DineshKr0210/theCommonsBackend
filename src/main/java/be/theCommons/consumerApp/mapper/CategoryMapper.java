package be.theCommons.consumerApp.mapper;

import be.theCommons.consumerApp.dto.CategoryDTO;
import be.theCommons.consumerApp.model.Category;

import java.util.stream.Collectors;

public class CategoryMapper {

    public static CategoryDTO toDTO(Category category) {
        if (category == null) return null;
        return CategoryDTO.builder()
                .id(category.getId() != null ? Long.valueOf(category.getId()) : null)
                .name(category.getName())
                .description(category.getDescription())
                .dishes(category.getDishes() != null ?
                        category.getDishes().stream()
                                .map(DishMapper::toDTO)
                                .collect(Collectors.toList())
                        : null)
                .build();
    }

    public static CategoryDTO catToDTO(Category category) {
        if (category == null) return null;
        return CategoryDTO.builder()
                .id(Long.valueOf(category.getId() != null ? category.getId() : null))
                .name(category.getName())
                .build();
    }
}