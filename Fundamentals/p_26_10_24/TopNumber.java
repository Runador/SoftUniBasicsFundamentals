package p_26_10_24;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            if (isDigitsSumDivisibleBy8(i) && hasOneOddDigitOrMore(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isDigitsSumDivisibleBy8(int n) {
        int sum = 0;
        while (n != 0) {
            int reminder = n % 10;
            sum += reminder;
            n /= 10;
        }
        return sum % 8 == 0;
    }

    private static boolean hasOneOddDigitOrMore(int n) {
        while (n != 0) {
            int reminder = n % 10;
            if (reminder % 2 != 0) {
                return true;
            } else {
                n /= 10;
            }
        }
        return false;
    }
}
