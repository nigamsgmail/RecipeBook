package com.abhishek.recipebook.recipebookrecipeserver.bean;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IngredientNutritionRepository extends JpaRepository<IngredientNutrition, String> {
	IngredientNutrition findByIngredientID(String ingredientID);
}