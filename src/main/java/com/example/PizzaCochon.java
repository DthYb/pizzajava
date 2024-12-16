package com.example;

import java.util.List;

public class PizzaCochon extends Pizza {
    private List<String> ingredients;

    public PizzaCochon(double poids) {
        super("Cochon", poids);
        this.ingredients = List.of("Gencives de porcs cannoises ", "fromage corse");
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ingrédients: " + ingredients;
    }
}
