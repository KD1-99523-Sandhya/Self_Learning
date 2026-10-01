package Question_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to add: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        int totalSum = list.stream()
                           .mapToInt(Integer::intValue)
                           .sum();

        System.out.println("\nNumbers entered: " + list);
        System.out.println("Sum of integers using Streams = " + totalSum);

        sc.close();
    }
}
