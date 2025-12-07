package be.theCommons.consumerApp.service;

import be.theCommons.consumerApp.dto.DishDTO;

import java.util.List;

public interface DishService {
    List<DishDTO> getAllDishesWithRelations();
    List<DishDTO> getDishesByCategory(String categoryName);
    List<DishDTO> getDishesByType(String type);
}