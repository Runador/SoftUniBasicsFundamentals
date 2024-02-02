package MethodsLab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printingTriangle(number);
    }

    private static void printingTriangle(int number) {
        printingTriangleTop(number);
        printingTriangleBottom(number);
    }

    private static void printingTriangleTop(int number) {
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static void printingTriangleBottom(int number) {
        for (int row = 1; row < number; row++) {
            for (int column = 1; column <= number - row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
