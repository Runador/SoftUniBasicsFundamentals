package p_26_10_24;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%.2f", calculateFactorial(Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine())));
    }

    private static double calculateFactorial(int first, int second) {
        int firstFact = 1;
        int secondFact = 1;
        while (first-- > 0) {
            firstFact *= first;
        }
        while (second-- > 0) {
            secondFact *= second;
        }
        return (firstFact * 1.0) / secondFact;
    }
}
