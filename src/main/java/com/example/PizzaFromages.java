package com.example;

import java.util.List;

public class PizzaFromages extends Pizza {
    private List<String> ingredients;

    public PizzaFromages(double poids) {
        super("Fromages", poids);
        this.ingredients = List.of("Parmesan", "Mozzarella", "Fontine", "Gorgonzola");
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ingrédients: " + ingredients;
    }
}
