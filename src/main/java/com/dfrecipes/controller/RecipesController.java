package com.dfrecipes.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dfrecipes.entity.Recipe;
import com.dfrecipes.repo.RecipesRepo;


@CrossOrigin 
@RequestMapping("/api/admin")
@RestController
public class RecipesController {

	@Autowired
	RecipesRepo recipesRepo;
	
	 //add account 
	  @PostMapping("/addrecipes")
		Recipe newRecipes(@RequestBody Recipe recipes){
		  return recipesRepo.save(recipes); 
		  }
	
	
	@GetMapping("/getrecipes")
	List<Recipe> getUser(){
		return recipesRepo.findAll();
	}

}