class Animal {
    String name;
    double typicalSize;
    double typicalWeight;
    String diet;

    public Animal(String name, double typicalSize, double typicalWeight, String diet) {
        this.name = name;
        this.typicalSize = typicalSize;
        this.typicalWeight = typicalWeight;
        this.diet = diet;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Typical Size: " + typicalSize + " meters");
        System.out.println("Typical Weight: " + typicalWeight + " kg");
        System.out.println("Diet: " + diet);
    }
}

class Bird extends Animal {
    double wingspan;
    boolean canFly;

    public Bird(String name, double typicalSize, double typicalWeight, String diet, double wingspan, boolean canFly) {
        super(name, typicalSize, typicalWeight, diet);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wingspan: " + wingspan + " meters");
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}

class LandAnimal extends Animal {
    int numberOfLegs;
    String habitat;

    public LandAnimal(String name, double typicalSize, double typicalWeight, String diet, int numberOfLegs, String habitat) {
        super(name, typicalSize, typicalWeight, diet);
        this.numberOfLegs = numberOfLegs;
        this.habitat = habitat;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Legs: " + numberOfLegs);
        System.out.println("Habitat: " + habitat);
    }
}

class Fish extends Animal {
    int numberOfFins;
    boolean canLiveInFreshwater;

    public Fish(String name, double typicalSize, double typicalWeight, String diet, int numberOfFins, boolean canLiveInFreshwater) {
        super(name, typicalSize, typicalWeight, diet);
        this.numberOfFins = numberOfFins;
        this.canLiveInFreshwater = canLiveInFreshwater;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Fins: " + numberOfFins);
        System.out.println("Can Live in Freshwater: " + (canLiveInFreshwater ? "Yes" : "No"));
    }
}

public class lab2 {
    public static void main(String[] args) {
        Bird eagle = new Bird("Eagle", 0.7, 6.0, "Predator", 2.0, true);
        LandAnimal elephant = new LandAnimal("Elephant", 3.0, 5000.0, "Vegetarian", 4, "Savannah");
        Fish salmon = new Fish("Salmon", 0.8, 5.0, "Predator", 4, true);

        System.out.println("Bird Details:");
        eagle.displayInfo();

        System.out.println("\nLand Animal Details:");
        elephant.displayInfo();

        System.out.println("\nFish Details:");
        salmon.displayInfo();
    }
}
