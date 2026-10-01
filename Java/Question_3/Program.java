package Question_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> zoo = new ArrayList<>();

        System.out.print("Enter number of animals to add to Zoo: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nSelect Animal Type (" + (i + 1) + "/" + n + "):");
            System.out.println("1. Lion");
            System.out.println("2. Elephant");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            System.out.print("Enter Animal Name: ");
            String name = sc.next();
            System.out.print("Enter Animal Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Cage Number: ");
            int cageNo = sc.nextInt();
            System.out.print("Enter Cage Location Sector: ");
            String loc = sc.next();
            Cage cage = new Cage(cageNo, loc);

            if (choice == 1) {
                System.out.print("Is Alpha Lion? (true/false): ");
                boolean isAlpha = sc.nextBoolean();

                zoo.add(new Lion(name, age, cage, isAlpha));
            } else {
                System.out.print("Enter Tusk Length (in meters): ");
                double tusk = sc.nextDouble();

                zoo.add(new Elephant(name, age, cage, tusk));
            }
        }

        System.out.println("\nZOO MANAGEMENT DISPLAY");
        for (Animal a : zoo) {
            System.out.println("\n" + a.toString());
            a.makeSound();
            a.eat();
        }

        sc.close();
    }
}
