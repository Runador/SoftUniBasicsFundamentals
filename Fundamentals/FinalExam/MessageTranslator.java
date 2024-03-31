package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(?<command>![A-Z][a-z]{3,}!:\\[[A-Za-z]{8,}\\])");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String message = scanner.nextLine();

            Matcher matcher = pattern.matcher(message);

            if (matcher.find()) {
                String output = matcher.group("command");
                String validCommand = getValidCommand(output);
                String validMessage = getValidMessage(output);
                String validOutput = getTranslatedMessage(validMessage);
                System.out.printf("%s: %s%n", validCommand, validOutput);
            } else {
                System.out.println("The message is invalid");
            }
            /*Translating a string means taking all letters from the string and turn them into
            ASCII numbers. After successful translation, print it in the following format:
            "{command}:{number1} {number2} … {numberN}"*/
        }

    }

    private static String getValidCommand(String message) {
        int startIndex = message.indexOf('!');
        int endIndex = message.lastIndexOf('!');
        return message.substring(startIndex + 1, endIndex);
    }

    private static String getValidMessage(String message) {
        int startIndex = message.indexOf('[');
        int endIndex = message.indexOf(']');
        return message.substring(startIndex + 1, endIndex);
    }

    private static String getTranslatedMessage(String message) {
        StringBuilder outputBuilder = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            outputBuilder.append((int) letter).append(" ");
        }
        return outputBuilder.toString();
    }

}
