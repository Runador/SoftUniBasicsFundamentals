package ProgrammingFundamentalsFinalExam01;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Decode")) {

            String[] tokens = input.split("\\|");
            String command = tokens[0];
            StringBuilder stringBuilder = new StringBuilder(encryptedMessage);

            if (command.equals("Move")) {
                // Move {number of letters}
                // Moves the first n letters to the back of the string
                int numberOfLetters = Integer.parseInt(tokens[1]);
                String substring = encryptedMessage.substring(0, numberOfLetters);
                stringBuilder.append(substring);
                stringBuilder.delete(0, numberOfLetters);
                encryptedMessage = stringBuilder.toString();
            } else if (command.equals("Insert")){
                // Insert {index} {value}
                // Inserts the given value before the given index in the string
                int index = Integer.parseInt(tokens[1]);
                String value = tokens[2];
                stringBuilder.insert(index, value);
                encryptedMessage = stringBuilder.toString();
            } else if (command.equals("ChangeAll")) {
                // ChangeAll {substring} {replacement}
                // Changes all occurrences of the given substring with the replacement text
                String substring = tokens[1];
                String replacement = tokens[2];
                for (int i = 0; i < stringBuilder.length(); i++) {
                    encryptedMessage = encryptedMessage.replace(substring, replacement);
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", encryptedMessage);
    }
}
