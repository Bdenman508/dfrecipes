package com.dfrecipes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dfrecipes.entity.Recipe;
import com.dfrecipes.repo.RecipesRepo;

@CrossOrigin
@RequestMapping("/api/recipe")
@RestController
public class RecipeController {

	@Autowired
	private RecipesRepo recipesRepo;
	
	@GetMapping("/get")
	public String get() {
		return "Hello World";
	}

	@PostMapping("/addRecipe")
	public Recipe newRecipes(@RequestBody Recipe recipes) {
		return recipesRepo.save(recipes);
	}

	@GetMapping("/getRecipes")
	public List<Recipe> getRecipes() {
		return recipesRepo.findAll();
	}

}