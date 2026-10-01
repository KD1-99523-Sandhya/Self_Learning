package Question_2;

public class Cube extends Shape3D {
    private double side;

    public Cube() {
        super("Cube");
        this.side = 0.0;
    }

    public Cube(double side) {
        super("Cube");
        this.side = side;
    }

    @Override
    public double calcArea() {
        return 6 * side * side;
    }

    @Override
    public double calcVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return super.toString() + " [Side=" + side + ", Surface Area=" + String.format("%.2f", calcArea()) + ", Volume=" + String.format("%.2f", calcVolume()) + "]";
    }
}
