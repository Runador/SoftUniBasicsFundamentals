package MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        if (input.equals("add")) {
            System.out.println(add(first, second));
        } else if (input.equals("subtract")) {
            System.out.println(subtract(first, second));
        } else if (input.equals("multiply")) {
            System.out.println(multiply(first, second));
        } else if (input.equals("divide")) {
            System.out.println(divide(first, second));
        }
    }

    private static int add (int first, int second) {
        return first + second;
    }

    private static int subtract(int first, int second) {
        return first - second;
    }

    private static int multiply(int first, int second) {
        return first * second;
    }

    private static int divide(int first, int second) {
        return first / second;
    }

}
