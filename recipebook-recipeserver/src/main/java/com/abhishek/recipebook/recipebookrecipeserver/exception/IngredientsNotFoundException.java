package com.abhishek.recipebook.recipebookrecipeserver.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IngredientsNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -8678546781377095026L;

	public IngredientsNotFoundException(String string) {
		super(string);
	}

}
