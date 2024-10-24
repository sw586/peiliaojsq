package com.dmkj.peiliaojsq.service;
//菜谱服务类 RecipeService：处理菜谱的业务逻辑。
import com.dmkj.peiliaojsq.model.Recipe;
import com.dmkj.peiliaojsq.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> findAllRecipes() {
        return recipeRepository.findAll();
    }

    public Recipe saveRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public List<Recipe> findSubRecipes(Recipe parentRecipe) {
        return recipeRepository.findByParentRecipe(parentRecipe);
    }
}
