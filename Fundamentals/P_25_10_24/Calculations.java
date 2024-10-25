package P_25_10_24;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int result = calculations(command, first, second);
        System.out.println(result);
    }

    private static int calculations(String command, int first, int second) {
        return switch (command) {
            case "add" -> first + second;
            case "multiply" -> first * second;
            case "subtract" -> first - second;
            case "divide" -> first / second;
            default -> 0;
        };
    }
}
