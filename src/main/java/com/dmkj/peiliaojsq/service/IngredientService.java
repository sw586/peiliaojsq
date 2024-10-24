package com.dmkj.peiliaojsq.service;

import com.dmkj.peiliaojsq.model.Ingredient; // 确保导入正确
import com.dmkj.peiliaojsq.model.Recipe;
import com.dmkj.peiliaojsq.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> findByRecipe(Recipe recipe) {
        return ingredientRepository.findByRecipe(recipe);
    }

    public List<Ingredient> findAll() { // 添加这个方法
        return ingredientRepository.findAll();
    }
}
