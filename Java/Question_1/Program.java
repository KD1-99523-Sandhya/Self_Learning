package Question_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Original Student Details");
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter City: ");
        String city = sc.next();
        System.out.print("Enter State: ");
        String state = sc.next();

        Address addr = new Address(city, state);
        Student original = new Student(roll, name, addr);

        System.out.println("\nOriginal Student: " + original);

        try {

            Student shallowObj = original.shallowCopy();
            System.out.println("\nDemonstrating Shallow Copy");
            System.out.println("Modifying city of shallow copy to 'Pune'...");
            shallowObj.getAddress().setCity("Pune");
            System.out.println("Original Student: " + original);
            System.out.println("Shallow Copy Student: " + shallowObj);

            Student deepObj = original.deepCopy();
            System.out.println("\nDemonstrating Deep Copy");
            System.out.println("Modifying city of deep copy to 'Mumbai'...");
            deepObj.getAddress().setCity("Mumbai");
            System.out.println("Original Student: " + original);
            System.out.println("Deep Copy Student: " + deepObj);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
