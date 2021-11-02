package com.abhishek.recipebook.recipebookrecipeserver.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class RecipeIngredients {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne
    @MapsId("recipeID")
    @JoinColumn(name = "recipeid")
    Recipe recipe;
	
	@ManyToOne
    @MapsId("ingredientID")
    @JoinColumn(name = "ingredientid")
    Ingredient ingredient;
	
	double quantity;

	public int getId() {
		return id;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public double getQuantity() {
		return quantity;
	}

	public RecipeIngredients(int id, Recipe recipe, Ingredient ingredient, double quantity) {
		super();
		this.id = id;
		this.recipe = recipe;
		this.ingredient = ingredient;
		this.quantity = quantity;
	}

	public RecipeIngredients() {
		super();
	}

	@Override
	public String toString() {
		return "RecipeIngredients [id=" + id + ", recipe=" + recipe + ", ingredient=" + ingredient + ", quantity="
				+ quantity + "]";
	}
	
}
