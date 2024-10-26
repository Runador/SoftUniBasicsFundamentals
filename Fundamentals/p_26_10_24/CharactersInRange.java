package p_26_10_24;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        printingCharacters(firstChar, secondChar);
    }

    private static void printingCharacters(char first, char second) {
        if (first > second) {
            for (int i = second + 1; i < first; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = first + 1; i < second; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
