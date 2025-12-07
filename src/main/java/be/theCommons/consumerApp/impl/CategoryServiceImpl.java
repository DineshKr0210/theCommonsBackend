package be.theCommons.consumerApp.impl;

import be.theCommons.consumerApp.dao.CategoryRepository;
import be.theCommons.consumerApp.dto.CategoryDTO;
import be.theCommons.consumerApp.mapper.CategoryMapper;
import be.theCommons.consumerApp.model.Category;
import be.theCommons.consumerApp.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(CategoryMapper::catToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<CategoryDTO> getAllCategoriesWithDishes() {
        return categoryRepository.getAllCategoriesWithDishes().stream()
                .map(CategoryMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryWithDishes(Long id) {
        return categoryRepository.findById(id)
                .map(CategoryMapper::toDTO)
                .orElse(null);
    }
}