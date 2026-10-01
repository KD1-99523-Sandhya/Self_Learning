package Question_3;

public class Lion extends Animal {
    private boolean isAlpha;

    public Lion() {
        super();
        this.isAlpha = false;
    }

    public Lion(String name, int age, Cage cage, boolean isAlpha) {
        super(name, age, cage);
        this.isAlpha = isAlpha;
    }

    public boolean isAlpha() {
        return isAlpha;
    }

    public void setAlpha(boolean isAlpha) {
        this.isAlpha = isAlpha;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars loudly: ROAR!!!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats meat (Carnivore).");
    }

    @Override
    public String toString() {
        return super.toString() + " [Species=Lion, IsAlpha=" + isAlpha + "]";
    }
}
