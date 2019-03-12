package org.academiadecodigo.tropadelete.SoupBuilder;

public class Soup {
    private final String soupName;
    private final Vegetables mainVegetable;
    private final int mainVegetableQuantities;
    private final Vegetables secondaryVegetable;
    private int secondaryVegetableQuantities;
    private int waterQuantity;
    private int cookingTime;

    //protect the state from foreign access
    //you can only change them if you deliberately use the builder
    private Soup(Cook cook) {
        this.soupName = cook.soupName;
        this.mainVegetable = cook.mainVegetable;
        this.mainVegetableQuantities = cook.mainVegetableQuantities;
        this.secondaryVegetable = cook.secondaryVegetable;
        this.secondaryVegetableQuantities = cook.secondaryVegetableQuantities;
        this.waterQuantity = cook.waterQuantity;
        this.cookingTime = cook.cookingTime;

    }

    //private access because we are in the same class
    private Vegetables getMainVegetable() {
        return mainVegetable;
    }

    private int getMainVegetableQuantities() {
        return mainVegetableQuantities;
    }

    private Vegetables getSecondaryVegetable() {
        return secondaryVegetable;
    }

    private int getSecondaryVegetableQuantities() {
        return secondaryVegetableQuantities;
    }

    private int getWaterQuantity() {
        return waterQuantity;
    }

    private String getSoupName() {
        return soupName;
    }

    public int getCookingTime() {
        return cookingTime;

    }

    @Override
    public String toString() {
        return (" Soup Name: " + getSoupName() + "\n"
                + " Main Vegetable: " + getMainVegetable() + "\n"
                + " Main Vegetable Quantities: " + getMainVegetableQuantities() + "\n"
                + " Secondary Vegetable: " + getSecondaryVegetable() + "\n"
                + " Secondary Vegetable Quantities: " + getSecondaryVegetableQuantities() + "\n"
                + " Water Quantities: " + getWaterQuantity()) + " quart \n"
                + " Cooking time: " + getCookingTime() + " minutes \n";


    }

    //create and instance of this inner class by first instantiating the outer class
    // the outer class WILL NOT otherwise
    public static class Cook {
        private String soupName;
        private Vegetables mainVegetable;
        private int mainVegetableQuantities;
        private Vegetables secondaryVegetable;
        private int secondaryVegetableQuantities;
        private int waterQuantity;
        private int cookingTime;


        //fluent interface
        public Cook secondaryVegetable(Vegetables secondaryVegetable) {
            this.secondaryVegetable = secondaryVegetable;
            return this;
        }

        //fluent interface
        public Cook mainVegetable(Vegetables mainVegetable) {
            this.mainVegetable = mainVegetable;
            return this;
        }

        //fluent interface
        public Cook secondaryVegetableQuantities(int secondaryVegetableQuantities) {
            this.secondaryVegetableQuantities = secondaryVegetableQuantities;
            return this;
        }

        //fluent interface
        public Cook mainVegetableQuantities(int mainVegetableQuantities) {
            this.mainVegetableQuantities = mainVegetableQuantities;
            return this;
        }

        //fluent interface
        public Cook waterQuantity(int waterQuantity) {
            this.waterQuantity = waterQuantity;
            return this;
        }

        //fluent interface
        public Cook cookingTime(int cookingTime) {
            this.cookingTime = cookingTime;
            return this;
        }
        //fluent interface
        public Cook soupName(String soupName) {
            this.soupName = soupName;
            return this;
        }

        public Soup makeIt() {
            if(soupName == null){
               this.soupName = "Unnamed Soup";
            }
            if (mainVegetable == null) {
                throw new IllegalArgumentException("Main Vegetable not set");
            }
            if (secondaryVegetable == null) {
                this.secondaryVegetable = Vegetables.NONE;
                this.secondaryVegetableQuantities(0);
            }
            if (secondaryVegetable == Vegetables.NONE && secondaryVegetableQuantities > 0) {
                throw new IllegalArgumentException("You are adding quantities of a vegetable you never specified");
            }
            if (secondaryVegetable != null && mainVegetableQuantities <= 0) {
                throw new IllegalArgumentException("Secondary Vegetable is " + secondaryVegetable + ", but quantity is 0");
            }
            if (mainVegetable.exists() && mainVegetableQuantities <= 0) {
                throw new IllegalArgumentException("Main Vegetable is " + mainVegetable + ", but quantity is 0");
            }
            if (mainVegetable == secondaryVegetable) {
                throw new IllegalArgumentException("Adding the same item twice makes no sense");
            }
            if (waterQuantity == 0) {
                throw new IllegalArgumentException("STOP! you need water!");
            }
            return new Soup(this);
        }
    }
}
