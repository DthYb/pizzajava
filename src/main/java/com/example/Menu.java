package com.example;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> pizzas;

    public Menu() {
        this.pizzas = new ArrayList<>();
    }

    public void ajouterPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Menu:\n");
        for (Pizza pizza : pizzas) {
            sb.append(pizza).append("\n");
        }
        return sb.toString();
    }
}
