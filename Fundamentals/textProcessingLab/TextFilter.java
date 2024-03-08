package TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();
        String replacement = "";

        for (int i = 0; i < bannedWords.length; i++) {
            replacement = "";

            String bannedWord = bannedWords[i];

            if (text.contains(bannedWord)) {
                for (int j = 0; j < bannedWord.length(); j++) {
                    replacement += "*";
                }

                text = text.replace(bannedWord, replacement);
            }
        }

        System.out.println(text);
    }
}

