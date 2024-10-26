package p_26_10_24;

import java.util.Scanner;

public class P_137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mathPower(2, 8));
    }

    private static double mathPower(double number, int power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result += number += i;
        }
        return result;
    }
}
