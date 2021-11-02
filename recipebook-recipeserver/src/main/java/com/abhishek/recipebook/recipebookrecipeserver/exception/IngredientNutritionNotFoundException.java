package com.abhishek.recipebook.recipebookrecipeserver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IngredientNutritionNotFoundException extends RuntimeException {


	private static final long serialVersionUID = 8189882739695272164L;

	public IngredientNutritionNotFoundException(String string) {
		super(string);
	}

}