package com.example;

public abstract class Pizza {
    private String nom;
    private double poids;

    public Pizza(String nom, double poids) {
        this.nom = nom;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public double getPoids() {
        return poids;
    }

    @Override
    public String toString() {
        return "Pizza [Nom: " + nom + ", Poids: " + poids + "g]";
    }
}
