package org.academiadecodigo.tropadelete.BuilderPattern;

//make everything default so you wont be able to instantiate it
public class Soup {

     private String chef;
     private String soupName;
     private String ingredients;
     private double amountOfVegetables;
     private double salt;
     private double spiceAmount;

    Soup(String chef, String soupName, String ingredients, double amountOfVegetables, double salt, double spiceAmount) {
        this.chef = chef;
        this.soupName = soupName;
        this.ingredients = ingredients;
        this.amountOfVegetables = amountOfVegetables;
        this.salt = salt;
        this.spiceAmount = spiceAmount;
    }

    public void getDetails() {
        System.out.println("\n-==-==-==-==-==-==-==-==-==-==-==-==-==-==-\n"
                + "Chef:                 " + this.chef + "\n"
                + "Soup Name:            " + this.soupName + "\n"
                + "Ingredients:          " + this.ingredients + "\n"
                + "Amount of Vegetables: " + this.amountOfVegetables + "\n"
                + "Salt factor:          " + this.salt + "\n"
                + "Spice factor:         " + this.spiceAmount + "\n"
                + "-==-==-==-==-==-==-==-==-==-==-==-==-==-==-"
        );
    }
}
