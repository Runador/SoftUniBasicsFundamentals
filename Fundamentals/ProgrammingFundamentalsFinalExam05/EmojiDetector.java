package ProgrammingFundamentalsFinalExam05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(?<element>([*]{2})[A-Z][a-z]{2,}([*]{2})|([\\:]{2})[A-Z][a-z]{2,}([\\:]{2}))");

        String input = scanner.nextLine();

        int threshold = calculateCoolThreshold(input);

        int counter = 0;

        Matcher matcher = pattern.matcher(input);

        System.out.println("Cool threshold: " + threshold);

        List<String> emojiList = new ArrayList<>();

        while (matcher.find()){
            String element = matcher.group("element");
            int emojiCoolness = calculateEmojiCoolness(element);
            if (emojiCoolness > threshold) {
                emojiList.add(element);
            }
            counter++;
        }

        System.out.printf("%d emojis found in the text. The cool ones are:%n", counter);

        emojiList.forEach(System.out::println);

    }


    private static int calculateCoolThreshold(String input) {
        String sumDigitsAsString = "";
        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            if (Character.isDigit(digit)) {
                sumDigitsAsString += digit;
            }
        }
        int sum = 1;
        for (int i = 0; i < sumDigitsAsString.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(sumDigitsAsString.charAt(i)));
            sum *= digit;
        }
        return sum;
    }


    private static int calculateEmojiCoolness(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (Character.isLetter(letter)) {
                sum += letter;
            }
        }
        return sum;
    }

}
