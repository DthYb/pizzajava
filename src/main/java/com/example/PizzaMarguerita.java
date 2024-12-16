package com.example;

import java.util.List;

public class PizzaMarguerita extends Pizza {
    private List<String> ingredients;

    public PizzaMarguerita(double poids) {
        super("Marguerita", poids);
        this.ingredients = List.of("Tomate", "Mozzarella", "Origan");
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ingrédients: " + ingredients;
    }
}
