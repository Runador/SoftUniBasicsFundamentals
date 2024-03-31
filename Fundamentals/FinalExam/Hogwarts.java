package FinalExam;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String spell = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Abracadabra")) {

            String[] tokens = input.split(" ");
            String command = tokens[0];

            if (command.equals("Abjuration")) {
                spell = spell.toUpperCase();
                System.out.println(spell);
            } else if (command.equals("Necromancy")) {
                spell = spell.toLowerCase();
                System.out.println(spell);
            } else if (command.equals("Illusion")) {
                int index = Integer.parseInt(tokens[1]);
                String letter = tokens[2];

                if (index >= 0 && index <= spell.length() - 1) {
                    StringBuilder stringBuilder = new StringBuilder(spell);
                    stringBuilder.setCharAt(index, letter.charAt(0));
                    spell = stringBuilder.toString();
                    System.out.println("Done!");
                } else {
                    System.out.println("The spell was too weak.");
                }
            } else if (command.equals("Divination")) {
                String firstSubstring = tokens[1];
                String secondSubstring = tokens[2];
                if (spell.contains(firstSubstring)) {
                    spell = spell.replace(firstSubstring, secondSubstring);
                }
                System.out.println(spell);
            } else if (command.equals("Alteration")) {
                String substring = tokens[1];
                spell = spell.replace(substring, "");
                System.out.println(spell);
            } else {
                System.out.println("The spell did not work!");
            }

            input = scanner.nextLine();
        }

    }
}
