package Question_2;

public class Rectangle extends Shape2D {
    private double length;
    private double breadth;

    public Rectangle() {
        super("Rectangle");
        this.length = 0.0;
        this.breadth = 0.0;
    }

    public Rectangle(double length, double breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calcArea() {
        return length * breadth;
    }

    @Override
    public String toString() {
        return super.toString() + " [Length=" + length + ", Breadth=" + breadth + ", Area=" + String.format("%.2f", calcArea()) + "]";
    }
}
