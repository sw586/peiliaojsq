package com.dmkj.peiliaojsq.controller;

import com.dmkj.peiliaojsq.model.Recipe;
import com.dmkj.peiliaojsq.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    @PostMapping
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    @PutMapping("/{id}")
    public Recipe updateRecipe(@PathVariable Long id, @RequestBody Recipe updatedRecipe) {
        return recipeRepository.findById(id).map(recipe -> {
            recipe.setName(updatedRecipe.getName());
            recipe.setParentRecipe(updatedRecipe.getParentRecipe());
            return recipeRepository.save(recipe);
        }).orElseThrow(() -> new RuntimeException("Recipe not found"));
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id) {
        recipeRepository.deleteById(id);
    }
}
