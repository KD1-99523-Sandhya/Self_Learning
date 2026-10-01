package Question_12;

import java.util.Comparator;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray before sorting:");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        Comparator<Integer> comp = (a, b) -> a.compareTo(b);

        SelectionSortUtil.selectionSort(arr, comp);

        System.out.println("\n\nArray after selection sort (Ascending):");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        sc.close();
    }
}
