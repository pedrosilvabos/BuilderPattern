class Chef implements Recipe {
    private Soup unCookedSoup;

    //prepate the soup to accept the vegetables
    //Constructor set the property as a new object
    public Chef() {
        unCookedSoup = new Soup();
    }

    @Override
    public Recipe setBowls(final int bowls) {
        unCookedSoup.setNumberOfBowls(bowls);
        return this;
    }

    @Override //fluent interface
    public Recipe addVegetables(final String vegetables) {
        unCookedSoup.setVegetables(vegetables);
        return this;
    }

    //A brand new object is created with the properties that were set
    // and it is returned to the caller
    @Override //fluent interface
    public Soup cookIt() {
        Soup soup = new Soup();
        soup.setVegetables(unCookedSoup.getVegetables());
        soup.setNumberOfBowls(unCookedSoup.getNumberOfBowls());
        return soup;
    }


}