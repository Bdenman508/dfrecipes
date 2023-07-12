package com.dfrecipes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ingredients")
public class Ingredients {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "ingredientNo")
	private int ingredientNo;
	@Column(name= "ingredient")
	private String ingredient;
	

	public int getIngredientNo() {
		return ingredientNo;
	}
	public void setIngredientNo(int ingredientNo) {
		this.ingredientNo = ingredientNo;
	}
	public String getIngradient() {
		return ingredient;
	}
	public void setIngradient(String ingradient) {
		this.ingredient = ingradient;
	}
	public Ingredients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ingredients(int ingredientNo, String ingradient) {
		super();
		this.ingredientNo = ingredientNo;
		this.ingredient = ingradient;
	}
	@Override
	public String toString() {
		return "Ingedients [ingredientNo=" + ingredientNo + ", ingradient=" + ingredient + "]";
	}
	
}
