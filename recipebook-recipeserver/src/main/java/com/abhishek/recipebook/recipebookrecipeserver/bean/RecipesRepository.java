package com.abhishek.recipebook.recipebookrecipeserver.bean;

import org.springframework.data.jpa.repository.JpaRepository;


public interface RecipesRepository extends JpaRepository<Recipe, String> {
	Recipe findByRecipeID(String recipeID);
	Recipe findByRecipeName(String recipeName);

}
