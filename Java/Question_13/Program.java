package Question_13;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();

        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            Student s = new Student();

            System.out.print("Enter Roll No : ");
            s.setRoll(sc.nextInt());

            System.out.print("Enter Name    : ");
            s.setName(sc.next());

            System.out.print("Enter City    : ");
            s.setCity(sc.next());

            System.out.print("Enter Marks   : ");
            s.setMarks(sc.nextDouble());

            arr[i] = s;
        }

        System.out.println("\nBEFORE SORTING");
        for (Student s : arr) {
            System.out.println(s);
        }

        Arrays.sort(arr, new StudentComparator());

        System.out.println("\nAFTER MULTI-LEVEL SORTING");
        System.out.println("(1st: City DESC | 2nd: Marks DESC | 3rd: Name ASC)");
        for (Student s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}
