package MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensAndOdds(number));

    }

    private static int getMultipleOfEvensAndOdds(int number) {
        int evenSum = 0;
        int oddSum = 0;
        while (number != 0) {
            int reminder = number % 10;
            if (reminder % 2 == 0) {
                evenSum += reminder;
            } else {
                oddSum += reminder;
            }
            number /= 10;
        }
        return Math.abs(evenSum * oddSum);
    }
}
