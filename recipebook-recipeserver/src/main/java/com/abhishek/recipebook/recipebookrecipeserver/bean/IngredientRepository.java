package com.abhishek.recipebook.recipebookrecipeserver.bean;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IngredientRepository extends JpaRepository<Ingredient, String> {
	Ingredient findByIngredientID(String ingredientID);
	Ingredient findByIngredientName(String ingredientName);
	List<Ingredient> findAll();
}