package com.example;

public class Main {
    public static void main(String[] args) {

        Adresse adresse = new Adresse("123 Rue de Lille", "Lille", "59000");
        Restaurant restaurant = new Restaurant("SARL", adresse, 5, 100000);

        Menu menu = new Menu();
        menu.ajouterPizza(new PizzaMarguerita(400));

        System.out.println(restaurant);
        System.out.println(menu);

        Adresse nouvelleAdresse = new Adresse("456 Rue de Paris", "Lille", "59000");
        restaurant.setAdresse(nouvelleAdresse);

        System.out.println("\nAprès déménagement:");
        System.out.println(restaurant);
    }
}
