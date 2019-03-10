package com.example.cmdf_app.model;

import java.util.HashMap;

public class Recipe {

    private HashMap<String, Serving> ingredients;

    public Recipe() {
    }

    public HashMap<String, Serving> getIngredients() {
        return ingredients;
    }

    public void changeServings(double multiplier) {
        for (HashMap.Entry<String, Serving> i: this.ingredients.entrySet()) {
            i.getValue().setSize(i.getValue().getSize()*multiplier);
        }
    }

}
