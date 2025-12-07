package be.theCommons.consumerApp.controller;

import be.theCommons.consumerApp.dto.CategoryDTO;
import be.theCommons.consumerApp.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryDTO> getAllCategories() {
        return categoryService.getAllCategories();
    }

    @GetMapping("/with-dishes")
    public List<CategoryDTO> getAllCategoriesWithDishes() {
        return categoryService.getAllCategoriesWithDishes();
    }

    @GetMapping("/{id}/dishes")
    public CategoryDTO getCategoryWithDishes(@PathVariable Long id) {
        return categoryService.getCategoryWithDishes(id);
    }
}
