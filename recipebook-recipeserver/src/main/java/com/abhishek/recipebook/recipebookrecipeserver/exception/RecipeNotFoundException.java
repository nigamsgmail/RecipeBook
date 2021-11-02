package com.abhishek.recipebook.recipebookrecipeserver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecipeNotFoundException extends RuntimeException {


	private static final long serialVersionUID = -4113453429244740198L;

	public RecipeNotFoundException(String string) {
		super(string);
	}

}
