package org.example.recipe_match_backend.domain.ingredient.repository;


import org.example.recipe_match_backend.domain.ingredient.domain.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient,Long> {
    Optional<Ingredient> findByIngredientName(String ingredientName);
}
