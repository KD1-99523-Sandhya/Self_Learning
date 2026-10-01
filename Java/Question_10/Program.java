package Question_10;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {

        System.out.println("Demonstrating IntStream Operations (1 to 10)");

        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("Sum of numbers (1..10) = " + sum);

        IntSummaryStatistics stats = IntStream.rangeClosed(1, 10)
                                              .summaryStatistics();

        System.out.println("\nIntSummaryStatistics Results");
        System.out.println("Count   : " + stats.getCount());
        System.out.println("Min     : " + stats.getMin());
        System.out.println("Max     : " + stats.getMax());
        System.out.println("Sum     : " + stats.getSum());
        System.out.println("Average : " + stats.getAverage());
    }
}
