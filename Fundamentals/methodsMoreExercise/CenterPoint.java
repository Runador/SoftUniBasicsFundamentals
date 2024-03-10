package MethodsMoreExercise;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X1 = Integer.parseInt(scanner.nextLine());
        int Y1 = Integer.parseInt(scanner.nextLine());
        int X2 = Integer.parseInt(scanner.nextLine());
        int Y2 = Integer.parseInt(scanner.nextLine());

        printClosestPoint(X1, Y1, X2, Y2);

    }

    private static void printClosestPoint(int x1, int y1, int x2, int y2) {
        if (x1 < x2 && y1 < y2) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }
    }

}
