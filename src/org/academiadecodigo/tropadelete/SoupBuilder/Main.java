package org.academiadecodigo.tropadelete.SoupBuilder;

public class Main {

    public static void main(String[] args) {

        Soup soup = new
                Soup.Cook()
                .mainVegetable(Vegetables.SPINACH)
                .mainVegetableQuantities(1)
                .secondaryVegetable(Vegetables.BROCCOLI)
                .secondaryVegetableQuantities(6)
                .cookingTime(20)
                .waterQuantity(1)
                .makeIt();

        System.out.println(soup.toString());
    }
}
