package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counts = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(input, counts));
    }

    private static String repeatString(String input, int counts) {
        String result = "";
        for (int i = 0; i < counts; i++) {
            result += input;
        }
        return result;
    }

}
