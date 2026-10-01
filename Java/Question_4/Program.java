package Question_4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Days of Week Enum Demo");
        System.out.println("Available Days:");
        for (Day d : Day.values()) {
            System.out.println("- " + d.name());
        }

        System.out.print("\nEnter a day name (e.g. SUNDAY): ");
        String input = sc.next().toUpperCase();

        try {
            Day selectedDay = Day.valueOf(input);

            System.out.println("\nDetails for " + selectedDay + ":");
            System.out.println("Day Category: " + selectedDay.getType());
            System.out.println("Is Weekend? : " + selectedDay.isWeekend());
            System.out.println("Is Weekday? : " + selectedDay.isWeekday());

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered!");
        }

        sc.close();
    }
}
