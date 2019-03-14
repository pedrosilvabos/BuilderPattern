package org.academiadecodigo.tropadelete;

import org.academiadecodigo.tropadelete.BuilderPattern.Soup;
import org.academiadecodigo.tropadelete.BuilderPattern.SoupBuilder;


public class Main {
    public static void main(String[] args) {

        Soup account = new SoupBuilder()
                .orderName("Pedro")
                .soupName("Boccolli Soup")
                .ingredients("Brocolli")
                .spicyFactor(2)
                .amountOfVegetables(2)
                .build();

        Soup anotherAccount = new SoupBuilder()
                .orderName("Pedro")
                .soupName("Tomato Soup")
                .ingredients("Tomatos")
                .spicyFactor(2.5)
                .salt(4)
                .build();

       account.getDetails();
       anotherAccount.getDetails();
    }
}
