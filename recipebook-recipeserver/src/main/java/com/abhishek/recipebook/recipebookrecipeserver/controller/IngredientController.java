package com.abhishek.recipebook.recipebookrecipeserver.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.recipebook.recipebookrecipeserver.bean.Ingredient;
import com.abhishek.recipebook.recipebookrecipeserver.bean.IngredientRepository;
import com.abhishek.recipebook.recipebookrecipeserver.exception.IngredientsNotFoundException;


@RestController
public class IngredientController {
	private static Logger logger = LoggerFactory.getLogger(IngredientController.class);
	@Autowired
	private IngredientRepository ingredientRepository;

	@GetMapping("/ingredient")
	public List<Ingredient> getAllIngredients() {
		logger.info("Calling getAllIngredients");
		List<Ingredient> allIngredients = ingredientRepository.findAll();
		if (allIngredients == null) {
			logger.error("Invalid getAllIngredients() - no entries found");
			throw new IngredientsNotFoundException("Ingredients not found");
		}
		return allIngredients;
	}
	
	@GetMapping("/ingredient/get/id/{ingredientID}")
	public Ingredient getIngredientByID(@PathVariable String ingredientID) {
		logger.info("Calling getIngredientByID({})", ingredientID);
		Ingredient ingredient = ingredientRepository.findByIngredientID(ingredientID);
		if (ingredient == null) {
			logger.error("Invalid getIngredientByID({}) - no entries found", ingredientID);
			throw new IngredientsNotFoundException("Ingredient id " + ingredientID + " not found");
		}
		return ingredient;
	}
	
	@GetMapping("/ingredient/get/name/{ingredientName}")
	public Ingredient getIngredientByName(@PathVariable String ingredientName) {
		logger.info("Calling getIngredientByName({})", ingredientName);
		Ingredient ingredient = ingredientRepository.findByIngredientName(ingredientName);
		if (ingredient == null) {
			logger.error("Invalid getIngredientByName({}) - no entries found", ingredientName);
			throw new IngredientsNotFoundException("Ingredient name " + ingredientName + " not found");
		}
		return ingredient;
	}
	

}
