package p_26_10_24;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumEvenOddDigitsMultiplied(Integer.parseInt(scanner.nextLine())));
    }

    private static int sumEvenOddDigitsMultiplied(int number) {
        int evenDigitsSum = 0;
        int oddDigitsSum = 0;
        while (number != 0) {
            int reminder = number % 10;
            if (reminder % 2 == 0) {
                evenDigitsSum += reminder;
            } else {
                oddDigitsSum += reminder;
            }
            number /= 10;
        }
        return evenDigitsSum * oddDigitsSum;
    }
}
