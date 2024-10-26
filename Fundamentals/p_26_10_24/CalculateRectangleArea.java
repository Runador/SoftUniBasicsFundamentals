package p_26_10_24;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%.0f", calculateRectArea(Double.parseDouble(scanner.nextLine()), Double.parseDouble(scanner.nextLine())));
    }

    private static double calculateRectArea(double width, double length) {
        return width * length;
    }
}
