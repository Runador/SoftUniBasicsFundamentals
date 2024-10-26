package p_26_10_24;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(repeatString(scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
    }

    private static String repeatString(String input, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += input;
        }
        return output;
    }
}
