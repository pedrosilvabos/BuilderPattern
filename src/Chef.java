class Chef implements Recipe {
    private Soup soupTmp;

    public Chef() {
        soupTmp = new Soup();
    }

    @Override
    public Soup makeIt() {
        Soup soup = new Soup();
        soup.setVegetables(soupTmp.getVegetables());
        soup.setNumberOfBowls(soupTmp.getNumberOfBowls());
        return soup;
    }

    @Override //fluent
    public Recipe addVegetables(final String vegetables) {
        soupTmp.setVegetables(vegetables);
        return this;
    }


    @Override
    public Recipe setBowls(final int bowls) {
        soupTmp.setNumberOfBowls(bowls);
        return this;
    }
}