package Question_11;

import java.util.Scanner;

public class Program {

    public static <T extends Number & Comparable<T>> T findMin(T[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        T min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements for Integer array: ");
        int n = sc.nextInt();

        Integer[] intArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            intArr[i] = sc.nextInt();
        }

        Integer minInt = findMin(intArr);
        System.out.println("Minimum Integer value = " + minInt);

        System.out.print("\nEnter number of elements for Double array: ");
        int m = sc.nextInt();

        Double[] doubleArr = new Double[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter double " + (i + 1) + ": ");
            doubleArr[i] = sc.nextDouble();
        }

        Double minDouble = findMin(doubleArr);
        System.out.println("Minimum Double value = " + minDouble);

        sc.close();
    }
}
