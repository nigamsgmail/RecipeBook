package com.abhishek.recipebook.recipebookrecipeserver.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.abhishek.recipebook.recipebookutils.ServingUnit;


@Entity
public class IngredientNutrition {
	@Id
	private String ingredientID;
	private Long servingSize;
	private ServingUnit servingUnit;
	private String servingSizeDescription;
	private double calories;
	private double energy;
	private double protein;
	private double totalFat;
	private double carbohydrates;
	private double cholesterol;
	private double sodium;
	private double potassium;
	private double calcium;
	private double vitaminA;
	private double vitaminC;
	private double vitaminD;
	
	public String getIngredientID() {
		return ingredientID;
	}
	public Long getServingSize() {
		return servingSize;
	}
	public ServingUnit getServingUnit() {
		return servingUnit;
	}
	public String getServingSizeDescription() {
		return servingSizeDescription;
	}
	public double getCalories() {
		return calories;
	}
	public double getEnergy() {
		return energy;
	}
	public double getProtein() {
		return protein;
	}
	public double getTotalFat() {
		return totalFat;
	}
	public double getCarbohydrates() {
		return carbohydrates;
	}
	public double getCholesterol() {
		return cholesterol;
	}
	public double getSodium() {
		return sodium;
	}
	public double getPotassium() {
		return potassium;
	}
	public double getCalcium() {
		return calcium;
	}
	public double getVitaminA() {
		return vitaminA;
	}
	public double getVitaminC() {
		return vitaminC;
	}
	public double getVitaminD() {
		return vitaminD;
	}
	
	public IngredientNutrition(String ingredientID, Long servingSize, ServingUnit servingUnit,
			String servingSizeDescription, double calories, double energy, double protein, double totalFat,
			double carbohydrates, double cholesterol, double sodium, double potassium, double calcium, double vitaminA,
			double vitaminC, double vitaminD) {
		super();
		this.ingredientID = ingredientID;
		this.servingSize = servingSize;
		this.servingUnit = servingUnit;
		this.servingSizeDescription = servingSizeDescription;
		this.calories = calories;
		this.energy = energy;
		this.protein = protein;
		this.totalFat = totalFat;
		this.carbohydrates = carbohydrates;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
		this.potassium = potassium;
		this.calcium = calcium;
		this.vitaminA = vitaminA;
		this.vitaminC = vitaminC;
		this.vitaminD = vitaminD;
	}

	public IngredientNutrition() {
		super();
	}

}

