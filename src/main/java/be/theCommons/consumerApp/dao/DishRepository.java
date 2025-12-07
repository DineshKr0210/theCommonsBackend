package be.theCommons.consumerApp.dao;

import be.theCommons.consumerApp.model.Dish;
import be.theCommons.consumerApp.model.enums.DishType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {

    // Return all dishes with category & types (JOIN FETCH)
    @Query("SELECT DISTINCT d FROM Dish d " +
           "LEFT JOIN FETCH d.category " +
           "LEFT JOIN FETCH d.types")
    List<Dish> getAllDishesWithRelations();

    // Return dishes by category
    @Query("SELECT DISTINCT d FROM Dish d " +
           "LEFT JOIN FETCH d.category c " +
           "LEFT JOIN FETCH d.types " +
           "WHERE c.name = :categoryName")
    List<Dish> getDishesByCategory(String categoryName);

    // Return dishes filtered by type
    @Query("SELECT DISTINCT d FROM Dish d " +
           "LEFT JOIN FETCH d.category " +
           "LEFT JOIN d.types t " +
           "WHERE t.name = :type")
    List<Dish> getDishesByType(DishType type);
}
