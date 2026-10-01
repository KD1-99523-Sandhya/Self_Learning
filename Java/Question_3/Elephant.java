package Question_3;

public class Elephant extends Animal {
    private double tuskLength;

    public Elephant() {
        super();
        this.tuskLength = 0.0;
    }

    public Elephant(String name, int age, Cage cage, double tuskLength) {
        super(name, age, cage);
        this.tuskLength = tuskLength;
    }

    public double getTuskLength() {
        return tuskLength;
    }

    public void setTuskLength(double tuskLength) {
        this.tuskLength = tuskLength;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets: TRUMPET!!!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats sugarcane and leaves (Herbivore).");
    }

    @Override
    public String toString() {
        return super.toString() + " [Species=Elephant, TuskLength=" + tuskLength + "m]";
    }
}
