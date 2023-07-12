package com.dfrecipes.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipesRepo extends JpaRepository<Recipes, int>{

}
