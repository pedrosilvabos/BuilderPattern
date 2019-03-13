interface Recipe {
    Soup cookIt();

    Recipe addVegetables(final String vegetables);

    Recipe setBowls(final int bowls);
}