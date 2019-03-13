public class SoupMaker {
    private Recipe soup;

    public SoupMaker(final Recipe soup) {
        this.soup = soup;
    }

    public Soup construct() {
        return soup.setBowls(4)
                .addVegetables("Tomato")
                .makeIt();
    }

    public static void main(final String[] arguments) {
        final Recipe soup = new Chef();

        final SoupMaker soupMaker = new SoupMaker(soup);

        System.out.println(soupMaker.construct());
    }
}