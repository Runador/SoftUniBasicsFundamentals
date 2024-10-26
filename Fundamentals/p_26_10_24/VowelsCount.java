package p_26_10_24;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getVowelsCount(scanner.nextLine()));
    }

    private static int getVowelsCount(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char sym = input.charAt(i);
            if (       sym == 'a' || sym == 'A'
                    || sym == 'e' || sym == 'E'
                    || sym == 'i' || sym == 'I'
                    || sym == 'o' || sym == 'O'
                    || sym == 'u' || sym == 'U'
            ) {
                counter++;
            }
        }
        return counter;
    }
}
