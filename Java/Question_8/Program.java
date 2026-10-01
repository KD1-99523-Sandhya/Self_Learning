package Question_8;

import java.util.Scanner;
import java.util.stream.LongStream;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number to calculate factorial: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (n == 0) {
            System.out.println("Factorial of 0 = 1");
        } else {


            long factorial = LongStream.rangeClosed(1, n)
                                      .reduce(1, (a, b) -> a * b);

            System.out.println("Factorial of " + n + " = " + factorial);
        }

        sc.close();
    }
}
