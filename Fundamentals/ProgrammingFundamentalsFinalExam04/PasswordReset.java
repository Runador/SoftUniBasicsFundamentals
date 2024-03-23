package ProgrammingFundamentalsFinalExam04;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String input = scanner.nextLine();

        String newRaw = "";

        while (!input.equals("Done")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            if (command.equals("TakeOdd")) {
                for (int i = 0; i < password.length(); i++) {
                    char sym = password.charAt(i);
                    if (i % 2 == 1) {
                        newRaw += sym;
                    }
                }
                password = newRaw;
                System.out.println(password);
            } else if (command.equals("Cut")) {
                int index = Integer.parseInt(tokens[1]);
                int length = Integer.parseInt(tokens[2]);
                String substring = password.substring(index, index + length);
                for (int i = 0; i < password.length(); i++) {
                    if (password.contains(substring)) {
                        password = password.replace(substring, "");
                    }
                }
                System.out.println(password);
            } else if (command.equals("Substitute")) {
                String substring = tokens[1];
                String substitute = tokens[2];
                if (password.contains(substring)) {
                    password = password.replaceAll(substring, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s", password);
    }
}
