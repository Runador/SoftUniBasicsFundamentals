package p_26_10_24;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(smallestNumber(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine())));
    }

    private static int smallestNumber(int first, int second, int third) {
        return Math.min(first, Math.min(second, third));
    }
}
