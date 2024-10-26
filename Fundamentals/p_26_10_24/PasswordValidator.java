package p_26_10_24;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        passwordValidator(scanner.nextLine());
    }

    private static void passwordValidator(String password) {
        boolean correctLength = lengthChecker(password);
        boolean lettersOrDigitsOnly = lettersOrDigitsOnlyChecker(password);
        boolean twoDigitsAtLeast = twoDigitsAtLeast(password);

        if (!correctLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!lettersOrDigitsOnly) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!twoDigitsAtLeast) {
            System.out.println("Password must have at least 2 digits");
        }
        if (correctLength && lettersOrDigitsOnly && twoDigitsAtLeast) {
            System.out.println("Password is valid");
        }
    }

    private static boolean lengthChecker(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean lettersOrDigitsOnlyChecker(String password) {
        for (int i = 0; i < password.length(); i++) {
            char sym = password.charAt(i);
            if (!Character.isLetterOrDigit(sym)) {
                return false;
            }
        }
        return true;
    }

    private static boolean twoDigitsAtLeast(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
            if (count == 2) {
                return true;
            }
        }
        return false;
    }
}
