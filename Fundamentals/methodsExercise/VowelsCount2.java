package methodsExercise;

import java.util.Scanner;

public class VowelsCount2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(printVowels(input));
    }

    private static int printVowels(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == 'a' || symbol == 'A' || symbol == 'e' || symbol == 'E'
                || symbol == 'i' || symbol == 'I' || symbol == 'o' || symbol == 'O'
                || symbol == 'u' || symbol == 'U') {
                count++;
            }
        }
        return count;
    }
}
