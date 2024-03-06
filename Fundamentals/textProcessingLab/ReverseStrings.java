package TextProcessingLab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder stringBuilder;

        while (!input.equals("end")) {

            stringBuilder = new StringBuilder(input);
            stringBuilder.reverse();
            System.out.printf("%s = %s%n", input, stringBuilder);

            input = scanner.nextLine();
        }

    }
}
