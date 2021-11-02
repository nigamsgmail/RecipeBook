package com.abhishek.recipebook.recipebookrecipeserver.bean;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingredient {
	@Id
	private String ingredientID;
	private String ingredientName;
	private String ingredientDescription;
	private Boolean isAllergen;

	
	public String getIngredientID() {
		return ingredientID;
	}
	public String getIngredientName() {
		return ingredientName;
	}
	public String getIngredientDescription() {
		return ingredientDescription;
	}
	public Boolean getIsAllergen() {
		return isAllergen;
	}
	public Ingredient(String ingredientID, String ingredientName, String ingredientDescription,
			Boolean isAllergen) {
		super();
		this.ingredientID = ingredientID;
		this.ingredientName = ingredientName;
		this.ingredientDescription = ingredientDescription;
		this.isAllergen = isAllergen;
	}
	
	public Ingredient() {
		super();
	}
}