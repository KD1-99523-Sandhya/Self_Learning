package Question_2;

public abstract class Shape {
    private String name;

    public Shape() {
        this.name = "";
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape: " + name;
    }
}
