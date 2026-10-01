package Question_2;

public class Circle extends Shape2D {
    private double radius;

    public Circle() {
        super("Circle");
        this.radius = 0.0;
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + " [Radius=" + radius + ", Area=" + String.format("%.2f", calcArea()) + "]";
    }
}
