package p_26_10_24;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            System.out.println(isPalindrome(Integer.parseInt(input)));
            input = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(int number) {
        String copyNumber = String.valueOf(number);
        String reversedNumber = "";
        for (int i = copyNumber.length() - 1; i >= 0; i--) {
            reversedNumber += copyNumber.charAt(i);
        }
        return copyNumber.equals(reversedNumber);
    }
}
