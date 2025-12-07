package be.theCommons.consumerApp.service;

import be.theCommons.consumerApp.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    List<CategoryDTO> getAllCategoriesWithDishes();
    CategoryDTO getCategoryWithDishes(Long id);
}