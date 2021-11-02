package com.abhishek.recipebook.recipebookrecipeserver.bean;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recipe {
	
	@Id
	private String recipeID;
	private String recipeName;
	private String recipeType;
	private String instructions;
	

	
	private double prepTime;
	private double cookTime;
	
	
	public String getRecipeID() {
		return recipeID;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public String getRecipeType() {
		return recipeType;
	}
	public String getInstructions() {
		return instructions;
	}
	
	public double getPrepTime() {
		return prepTime;
	}
	public double getCookTime() {
		return cookTime;
	}
	
	public Recipe(String recipeID, String recipeName, String recipeType, String instructions,
			double prepTime, double cookTime) {
		super();
		this.recipeID = recipeID;
		this.recipeName = recipeName;
		this.recipeType = recipeType;
		this.instructions = instructions;
		this.prepTime = prepTime;
		this.cookTime = cookTime;
	}
	
	public Recipe() {
		super();
	}
	
	@Override
	public String toString() {
		return "Recipe [recipeID=" + recipeID + ", recipeName=" + recipeName + ", recipeType=" + recipeType
				+ ", instructions=" + instructions + ", prepTime=" + prepTime + ", cookTime=" + cookTime + "]";
	}
	
}