package com.dmkj.peiliaojsq.repository;

import com.dmkj.peiliaojsq.model.Ingredient;
import com.dmkj.peiliaojsq.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    List<Ingredient> findByRecipe(Recipe recipe);
}
