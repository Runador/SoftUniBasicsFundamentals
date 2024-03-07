package TextProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        List<Character> others = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char sym = input.charAt(i);
            if (Character.isDigit(sym)) {
                digits.add(sym);
            } else if (Character.isLetter(sym)) {
                letters.add(sym);
            } else {
                others.add(sym);
            }
        }

        System.out.println(String.join("", digits.toString()));
        System.out.println(letters);
        System.out.println(others);
    }
}
