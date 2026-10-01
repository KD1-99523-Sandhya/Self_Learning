package Question_2;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere() {
        super("Sphere");
        this.radius = 0.0;
    }

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calcVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return super.toString() + " [Radius=" + radius + ", Surface Area=" + String.format("%.2f", calcArea()) + ", Volume=" + String.format("%.2f", calcVolume()) + "]";
    }
}
