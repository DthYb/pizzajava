package com.example;

public class Restaurant {
    private String statutJuridique;
    private Adresse adresse;
    private int nombreEmployes;
    private double chiffreAffaires;

    public Restaurant(String statutJuridique, Adresse adresse, int nombreEmployes, double chiffreAffaires) {
        this.statutJuridique = statutJuridique;
        this.adresse = adresse;
        this.nombreEmployes = nombreEmployes;
        this.chiffreAffaires = chiffreAffaires;
    }

    public String getStatutJuridique() {
        return statutJuridique;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse nouvelleAdresse) {
        this.adresse = nouvelleAdresse;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public void setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    @Override
    public String toString() {
        return "Restaurant [" +
                "Statut juridique: " + statutJuridique +
                ", Adresse: " + adresse +
                ", Nombre d'employés: " + nombreEmployes +
                ", Chiffre d'affaires: " + chiffreAffaires + "]";
    }
}
