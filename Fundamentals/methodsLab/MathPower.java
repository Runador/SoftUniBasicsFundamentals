package MethodsLab;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        Scanner input1 = new Scanner(first);
        Scanner input2 = new Scanner(second);

        if (input1.hasNextInt() && input2.hasNextInt()) {
            int number = Integer.parseInt(input1.nextLine());
            int power = Integer.parseInt(input2.nextLine());
            System.out.println(getPower(number, power));
        } else if (input1.hasNextDouble() && input2.hasNextDouble()) {
            double number = Double.parseDouble(input1.nextLine());
            double power = Double.parseDouble(input2.nextLine());
            System.out.println(getPower(number, power));
        }
    }

    private static int getPower(int number, int power) {
        int result = (int) Math.pow(number, power);
        return result;
    }

    private static double getPower(double number, double power) {
        double result = Math.pow(number, power);
        return result;
    }

}
