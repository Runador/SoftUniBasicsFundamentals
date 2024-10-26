package p_26_10_24;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calculator(Integer.parseInt(scanner.nextLine()), scanner.nextLine().charAt(0),
                Integer.parseInt(scanner.nextLine())));
    }

    private static int calculator(int first, char operator, int second) {
        int result = 0;
        switch (operator) {
            case '+' -> result = first + second;
            case '-' -> result = first - second;
            case '*' -> result = first * second;
            case '/' -> result = first / second;
        }
        return result;
    }
}
