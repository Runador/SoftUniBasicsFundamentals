package p_26_10_24;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%.0f", mathPower(Double.parseDouble(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine())));
    }

    private static double mathPower(double number, int power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        return result;
    }
}
