package be.theCommons.consumerApp.controller;

import be.theCommons.consumerApp.dto.DishDTO;
import be.theCommons.consumerApp.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dishes")
@RequiredArgsConstructor
public class DishController {
    private final DishService dishService;

    @GetMapping
    public List<DishDTO> getAllDishes() {
        return dishService.getAllDishesWithRelations();
    }

    @GetMapping("/category/{categoryName}")
    public List<DishDTO> getDishesByCategory(@PathVariable String categoryName) {
        return dishService.getDishesByCategory(categoryName);
    }

    @GetMapping("/type/{type}")
    public List<DishDTO> getDishesByType(@PathVariable String type) {
        return dishService.getDishesByType(type);
    }
}
