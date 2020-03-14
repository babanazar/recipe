package guru.springframework.recipe.service;

import guru.springframework.recipe.model.Recipe;
import guru.springframework.recipe.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}
