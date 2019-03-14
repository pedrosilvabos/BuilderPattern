package org.academiadecodigo.tropadelete.BuilderPattern;

public class SoupBuilder {
    private String chef;
    private String soupName;
    private String ingredients;
    private double amountOfVegetables;
    private double salt;
    private double spiceAmount;

    public SoupBuilder orderName(String owner) {
        this.chef = owner;
        return this;
    }

    public SoupBuilder soupName(String soupName) {
        this.soupName = soupName;
        return this;
    }

    public SoupBuilder ingredients(String ingredients) {
        this.ingredients = ingredients;
        return this;
    }
    public SoupBuilder salt(double salt) {
        this.salt = salt;
        return this;
    }
    public SoupBuilder amountOfVegetables(double amountOfVegetables) {
        this.amountOfVegetables = amountOfVegetables;
        return this;
    }
    public SoupBuilder spicyFactor(double spiceAmount) {
        this.spiceAmount = spiceAmount;
        return this;
    }

    public Soup build() {
        //Here we create the actual soup
        //which is always in a fully initialised state when it's returned.
        return new Soup(chef, soupName, ingredients, amountOfVegetables, spiceAmount, salt);
        //the builder is in the Soup package, we can invoke its default constructor.
    }

}
