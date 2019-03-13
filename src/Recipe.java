interface Recipe {
    Soup makeIt();

    Recipe addVegetables(final String vegetables);

    Recipe setBowls(final int bowls);
}