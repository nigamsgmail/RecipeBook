package com.abhishek.recipebook.recipebookrecipeserver.bean;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientsRepository extends JpaRepository<RecipeIngredients, Integer> {
	List<RecipeIngredients> findAll();
}
