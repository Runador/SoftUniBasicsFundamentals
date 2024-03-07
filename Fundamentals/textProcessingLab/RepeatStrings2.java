package TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : input) {
            int wordLength = word.length();
            output.append(word.repeat(wordLength));
        }

        System.out.println(output);
    }

}
