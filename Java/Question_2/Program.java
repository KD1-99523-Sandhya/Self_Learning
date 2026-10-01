package Question_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of shapes to create: ");
        int n = sc.nextInt();

        Shape[] shapes = new Shape[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nSelect Shape Type (" + (i + 1) + "/" + n + "):");
            System.out.println("1. Circle (2D)");
            System.out.println("2. Rectangle (2D)");
            System.out.println("3. Sphere (3D)");
            System.out.println("4. Cube (3D)");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Circle Radius: ");
                    double r = sc.nextDouble();

                    shapes[i] = new Circle(r);
                    break;

                case 2:
                    System.out.print("Enter Rectangle Length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter Rectangle Breadth: ");
                    double b = sc.nextDouble();

                    shapes[i] = new Rectangle(l, b);
                    break;

                case 3:
                    System.out.print("Enter Sphere Radius: ");
                    double sr = sc.nextDouble();

                    shapes[i] = new Sphere(sr);
                    break;

                case 4:
                    System.out.print("Enter Cube Side: ");
                    double side = sc.nextDouble();

                    shapes[i] = new Cube(side);
                    break;

                default:
                    System.out.println("Invalid choice. Defaulting to Circle(1.0)");
                    shapes[i] = new Circle(1.0);
                    break;
            }
        }

        System.out.println("\nSHAPE DETAILS");
        for (Shape s : shapes) {

            System.out.println(s.toString());

            if (s instanceof Shape3D) {

                Shape3D s3d = (Shape3D) s;
                System.out.println(" -> Volume calculated via Downcasting: " + String.format("%.2f", s3d.calcVolume()));
            }
        }

        sc.close();
    }
}
