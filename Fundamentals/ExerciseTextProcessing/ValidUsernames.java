package ExerciseTextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            if (isLengthBetween3and16(username) && isContainsOnlyLettersNumbersHyphensUnderscores(username)) {
                System.out.println(username);
            }
        }

    }

    private static boolean isLengthBetween3and16(String username) {
        return username.length() >= 3 && username.length() <= 16;
    }

    private static boolean isContainsOnlyLettersNumbersHyphensUnderscores(String username) {
        for (int i = 0; i < username.length(); i++) {
            char sym = username.charAt(i);
            if (!(Character.isLetter(sym) || Character.isDigit(sym) || sym == '-' || sym == '_')) {
                return false;
            }
        }
        return true;
    }

}
