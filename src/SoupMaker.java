public class SoupMaker {
    private Recipe soup;

    public SoupMaker(Recipe soup) {
        this.soup = soup;
    }

    public Soup orderIt() {
        return soup.setBowls(4)
                .addVegetables("Broccoli")
                .cookIt();
    }

    public static void main(String[] arguments) {
        Recipe soup = new Chef();

        final SoupMaker soupMaker = new SoupMaker(soup);

        System.out.println(soupMaker.orderIt());
    }
}