package Question_3;

public abstract class Animal {
    private String name;
    private int age;

    private Cage cage;

    public Animal() {
        this.name = "";
        this.age = 0;
        this.cage = new Cage();
    }

    public Animal(String name, int age, Cage cage) {
        this.name = name;
        this.age = age;
        this.cage = cage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    public abstract void makeSound();
    public abstract void eat();

    @Override
    public String toString() {
        return "Animal [Name=" + name + ", Age=" + age + ", " + cage + "]";
    }
}
