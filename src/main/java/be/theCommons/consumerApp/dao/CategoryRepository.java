package be.theCommons.consumerApp.dao;

import be.theCommons.consumerApp.dto.CategoryDTO;
import be.theCommons.consumerApp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    // Return all categories with dishes (JOIN FETCH)
    @Query("SELECT c FROM Category c LEFT JOIN FETCH c.dishes")
    List<Category> getAllCategoriesWithDishes();

}