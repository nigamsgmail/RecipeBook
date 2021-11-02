package com.abhishek.recipebook.recipebookrecipeserver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecipeIngredientsNotFoundException extends RuntimeException {


	private static final long serialVersionUID = -5523778118284235449L;

	public RecipeIngredientsNotFoundException(String string) {
	}

}
