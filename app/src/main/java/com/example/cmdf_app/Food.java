package com.example.cmdf_app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Food implements Comparable<Food> {

    private String name;
    private int shelfLife;
    private Nutrition nutrition;
    private int count;
    private Date expiryDate;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public int compareTo(Food o) {
        if (this.getShelfLife() > o.getShelfLife()) {
            return 0;
        } else {
            return 1;
        }
    }

    public List<Recipe> getRecipes() {
        List<Recipe> recipes = new ArrayList<>();
        /*
        parse recipe info and put recipes into a list
         */
        for (Recipe r: recipes) {
            if (r.getIngredients().containsKey(this.getName())) {
                recipes.add(r);
            }
        }
        return recipes;
    }

    public int calculateShelfLife() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        int shelfLife;
        shelfLife = expiryDate.getDate() - date.getDate();
        this.setShelfLife(shelfLife);
        return shelfLife;
    }

}
