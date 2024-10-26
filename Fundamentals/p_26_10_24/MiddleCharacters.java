package p_26_10_24;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(printMiddleCharacter(scanner.nextLine()));
    }

    private static String printMiddleCharacter(String input) {
        String output = "";
        String firstPart = input.substring(0, input.length() / 2);
        String secondPart = input.substring(input.length() / 2, input.length() - 1);
        if (input.length() % 2 == 0) {
            output += firstPart.charAt(firstPart.length() - 1);
            output += secondPart.charAt(0);
        } else {
            output += secondPart.charAt(0);
        }
        return output;
    }
}
