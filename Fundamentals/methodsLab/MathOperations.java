package MethodsLab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double num2 = Integer.parseInt(scanner.nextLine());

        if (operator == '+') {
            System.out.printf("%.0f", add(num1, num2));
        } else if (operator == '-') {
            System.out.printf("%.0f", subtract(num1, num2));
        } else if (operator == '*') {
            System.out.printf("%.0f", multiply(num1, num2));
        } else if (operator == '/') {
            System.out.printf("%.0f", divide(num1, num2));
        }
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private static double divide(double num1, double num2) {
        return num1 / num2;
    }

}
