package be.theCommons.consumerApp.impl;

import be.theCommons.consumerApp.dao.DishRepository;
import be.theCommons.consumerApp.dto.DishDTO;
import be.theCommons.consumerApp.mapper.DishMapper;
import be.theCommons.consumerApp.model.enums.DishType;
import be.theCommons.consumerApp.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DishServiceImpl implements DishService {
    private final DishRepository dishRepository;

    public DishServiceImpl(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Override
    @Cacheable("AllDishes")
    public List<DishDTO> getAllDishesWithRelations() {
        return dishRepository.getAllDishesWithRelations().stream()
                .map(DishMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Cacheable("DishesByCategory")
    public List<DishDTO> getDishesByCategory(String categoryName) {
        return dishRepository.getDishesByCategory(categoryName).stream()
                .map(DishMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Cacheable("DishesByType")
    public List<DishDTO> getDishesByType(String type) {
        DishType parsed = DishType.valueOf(type.toUpperCase());
        return dishRepository.getDishesByType(parsed).stream()
                .map(DishMapper::toDTO)
                .collect(Collectors.toList());
    }
}