package Question_5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text to analyze: ");
        String line = sc.nextLine();

        TextAnalyzer analyzer = new TextAnalyzer(line);
        analyzer.analyze();

        sc.close();
    }
}
