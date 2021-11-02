package com.abhishek.recipebook.recipebookrecipeserver.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.recipebook.recipebookrecipeserver.bean.RecipeIngredients;
import com.abhishek.recipebook.recipebookrecipeserver.bean.RecipeIngredientsRepository;
import com.abhishek.recipebook.recipebookrecipeserver.exception.RecipeIngredientsNotFoundException;

@RestController
public class RecipeIngredientsController {
	private static Logger logger = LoggerFactory.getLogger(RecipeIngredientsController.class);
	@Autowired
	private RecipeIngredientsRepository recipeIngredientsRepository;

	@GetMapping("/recipe-ingredients")
	public List<RecipeIngredients> getAllRecipeIngredients() {
		logger.info("Calling getAllIngredients()");
		List<RecipeIngredients> allRecipeIngredients = recipeIngredientsRepository.findAll();
		if (allRecipeIngredients == null) {
			logger.error("Invalid getAllRecipeIngredients() - no entries found");
			throw new RecipeIngredientsNotFoundException("Recipe Ingredients not found");
		}
		return allRecipeIngredients;
	}
	
}
