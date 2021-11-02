package com.abhishek.recipebook.recipebookrecipeserver.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.recipebook.recipebookrecipeserver.bean.IngredientNutrition;
import com.abhishek.recipebook.recipebookrecipeserver.bean.IngredientNutritionRepository;
import com.abhishek.recipebook.recipebookrecipeserver.exception.IngredientNutritionNotFoundException;



@RestController
public class IngredientNutritionController {
	private static Logger logger = LoggerFactory.getLogger(IngredientNutritionController.class);
	
	@Autowired
	private IngredientNutritionRepository ingredientNutritionRepository; 
	
	
	@GetMapping("/ingredient-nutrition")
	public List<IngredientNutrition> getAllIngredientsNutrition() {
		logger.info("Calling getAllIngredientsNutrition()");
		List<IngredientNutrition> allIngredientsNutrition = ingredientNutritionRepository.findAll();
		if (allIngredientsNutrition  == null) {
			logger.error("Invalid getAllIngredientsNutrition() - no entries found");
			throw new IngredientNutritionNotFoundException("Ingredients not found");
		}
		return allIngredientsNutrition ;
	}
	
	
	@GetMapping("/ingredient-nutrition/get/id/{ingredientID}")
	public IngredientNutrition getIngredientsNutritionByID(@PathVariable String ingredientID) {
		logger.info("Calling getIngredientsNutritionByID({})", ingredientID);
		IngredientNutrition ingredientNutrition = ingredientNutritionRepository.findByIngredientID(ingredientID);
		
		if (ingredientNutrition == null) {
			logger.error("Invalid getIngredientsNutritionByID({}) - no entries found", ingredientID);
			throw new IngredientNutritionNotFoundException("Ingredient isn't registered");
		}
		
		return ingredientNutrition;
	}

}