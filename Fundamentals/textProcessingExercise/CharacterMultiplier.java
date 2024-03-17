package TextProcessing.ExerciseTextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        String firstString = tokens[0];
        String secondString = tokens[1];
        int sum = returnSumOfCharacters(firstString, secondString);

        System.out.println(sum);
    }

    private static int returnSumOfCharacters(String firstString, String secondString) {
        int sum = 0;
        StringBuilder stringBuilder1 = new StringBuilder(firstString);
        StringBuilder stringBuilder2 = new StringBuilder(secondString);

        StringBuilder stringBuilder3;

        if (stringBuilder1.length() > stringBuilder2.length()) {
            stringBuilder3 = new StringBuilder(stringBuilder1.substring(stringBuilder2.length(), stringBuilder1.length()));
        } else {
            stringBuilder3 = new StringBuilder(stringBuilder2.substring(stringBuilder1.length(), stringBuilder2.length()));
        }

        int minSize = Math.min(stringBuilder1.length(), stringBuilder2.length());

        for (int i = 0; i < minSize; i++) {
                char symFirst = firstString.charAt(i);
                char symSecond = secondString.charAt(i);
                sum += symFirst * symSecond;
            }

        for (int i = 0; i < stringBuilder3.length(); i++) {
            char sym = stringBuilder3.charAt(i);
            sum += sym;
        }

        return sum;
    }

}
