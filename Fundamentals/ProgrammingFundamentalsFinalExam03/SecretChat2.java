package ProgrammingFundamentalsFinalExam03;

import java.util.Scanner;

public class SecretChat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();
        StringBuilder concealedMessageBuilder = new StringBuilder(concealedMessage);

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {

            String[] tokens = input.split(":\\|:");
            String command = tokens[0];

            if (command.equals("InsertSpace")) {
                int index = Integer.parseInt(tokens[1]);
                concealedMessageBuilder.insert(index, " ");
                System.out.println(concealedMessageBuilder);
            } else if (command.equals("Reverse")) {
                String substring = tokens[1];
                if (concealedMessageBuilder.toString().contains(substring)) {
                    concealedMessageBuilder = new StringBuilder(concealedMessageBuilder.toString().replace(substring, ""));
                    StringBuilder replacedBuilder = new StringBuilder(substring);
                    replacedBuilder.reverse();
                    concealedMessageBuilder.append(replacedBuilder);
                    System.out.println(concealedMessageBuilder);
                } else {
                    System.out.println("error");
                }
            } else if (command.equals("ChangeAll")) {
                String substring = tokens[1];
                String replacement = tokens[2];
                if (concealedMessageBuilder.toString().contains(substring)) {
                    concealedMessageBuilder = new StringBuilder(concealedMessageBuilder.toString().replace(substring, replacement));
                }
                System.out.println(concealedMessageBuilder);
            }

            input = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s", concealedMessageBuilder);
    }
}
