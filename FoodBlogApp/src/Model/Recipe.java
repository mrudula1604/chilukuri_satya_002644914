/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;
import javax.swing.Icon;

/**
 *
 * @author Chilukuri
 */
public class Recipe {
    
    private String recipeTitle;
    private int numberOfServings;
    private Boolean isGlutenFree;
    private float difficultyLevel;
    private Integer numberOfIngredients;
    private String category;
    private String description;
    private Icon recipePicture;
    private Float difficulty;

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public Integer getNumberOfServings() {
        return numberOfServings;
    }

    public void setNumberOfServings(int numberOfServings) {
        this.numberOfServings = numberOfServings;
    }

    public Boolean getIsGlutenFree() {
        return isGlutenFree;
    }

    public void setIsGlutenFree(Boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    public float getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(float difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Integer getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public void setNumberOfIngredients(Integer numberOfIngredients) {
        this.numberOfIngredients = numberOfIngredients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Icon getRecipePicture() {
        return recipePicture;
    }

    public void setRecipePicture(Icon recipePicture) {
        this.recipePicture = recipePicture;
    }

    public Float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Float difficulty) {
        this.difficulty = difficulty;
    }
    
      
}
