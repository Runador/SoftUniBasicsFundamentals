package MethodsExercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printingMiddleCharacter(input);
    }

    private static void printingMiddleCharacter(String input) {
        if (input.length() % 2 == 0) {
            System.out.print(input.charAt(input.length() / 2 - 1));
            System.out.print(input.charAt(input.length() / 2));
        } else {
            System.out.println(input.charAt(input.length() / 2));
        }
    }

}
