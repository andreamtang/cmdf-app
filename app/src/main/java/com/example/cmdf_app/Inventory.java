package com.example.cmdf_app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventory {

    private static Inventory inventory = null;

    private List<Food> invo;

    private Inventory() {
        invo = new ArrayList<>();

    }

    public static Inventory getInstance() {
        if (inventory == null) {
            inventory = new Inventory();
        }

        return inventory;
    }

    public void addFood(Food food) {
        invo.add(food);
        sortInventory();
    }

    private void sortInventory() {
        Collections.sort(invo);
    }

    public List<Food> returnRecipeListForFood(Food food) {
        List<Food> contains = new ArrayList<>();
        for (Food f: invo) {
            if (f.getName().equals(food.getName())) {
                contains.add(f);
            }
        }
        return contains;
    }

}
