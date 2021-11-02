package com.abhishek.recipebook.recipebookrecipeserver.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.recipebook.recipebookrecipeserver.bean.Recipe;
import com.abhishek.recipebook.recipebookrecipeserver.bean.RecipesRepository;
import com.abhishek.recipebook.recipebookrecipeserver.exception.RecipeNotFoundException;


@RestController
public class RecipesController {
	private static Logger logger = LoggerFactory.getLogger(RecipesController.class);
	
	@Autowired
	private RecipesRepository recipesRepository;
	
	
	@GetMapping("/recipes")
	public List<Recipe> getAllRecipes() {
		logger.info("Calling getAllRecipes() ");
		List<Recipe> allRecipes = recipesRepository.findAll();
		if (allRecipes  == null) {
			logger.error("Invalid getAllRecipes() - no entries found");
			throw new RecipeNotFoundException("Ingredients not found");
		}
		return allRecipes ;
	}
	
	@GetMapping("/recipes/get/id/{recipeID}")
	public Recipe getRecipeByID(@PathVariable String recipeID) {
		logger.info("Calling getRecipeByID --> {}", recipeID);
		Recipe recipe = recipesRepository.findByRecipeID(recipeID);
		if (recipe == null) {
			logger.error("Invalid getRecipeByID --> {}", recipeID);
			throw new RecipeNotFoundException("Unable to find any data with this id " + recipeID + " ");
		}
		
		return recipe;
	}
	
	@GetMapping("/recipes/get/name/{recipeName}")
	public Recipe getRecipeByName(@PathVariable String recipeName) {
		logger.info("Calling getRecipeByName --> {}", recipeName);
		Recipe recipe = recipesRepository.findByRecipeName(recipeName); 
		if (recipe == null) {
			logger.error("Invalid getRecipeByName --> {}", recipeName);
			throw new RecipeNotFoundException("Unable to find any data with this name " + recipeName + " ");
		}
		
		return recipe; 
	}
}
