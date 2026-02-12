package xyz.jovanstoiljkovic.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.jovanstoiljkovic.starter.models.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Integer> {
}
