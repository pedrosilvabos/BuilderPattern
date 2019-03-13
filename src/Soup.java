class Soup {
    //this will be a blueprint for all the soups
    private int numberOfBowls;
    private String vegetables;

    public Soup() {
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(final String vegetables) {

        this.vegetables = vegetables;
    }

    public int getNumberOfBowls() {
        return numberOfBowls;
    }

    public void setNumberOfBowls(final int numberOfBowls) {
        this.numberOfBowls = numberOfBowls;
    }

    @Override
    public String toString() {
        return "Servig " + numberOfBowls + " bowls, of " + vegetables + " soup.";
    }
}
