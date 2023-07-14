package com.dfrecipes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dfrecipes.entity.Recipe;

@Repository
public interface RecipesRepo extends JpaRepository<Recipe, Integer>{

}
