package MethodsExercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            if (isContainsOddDigit(i) && isDivisibleByEight(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean isContainsOddDigit(int number) {
        while (number != 0) {
            int reminder = number % 10;
            if (reminder % 2 == 1) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    private static boolean isDivisibleByEight(int number) {
        int sum = 0;
        while (number != 0) {
            int reminder = number % 10;
            sum += reminder;
            number /= 10;
        }
        return sum % 8 == 0;
    }

}
