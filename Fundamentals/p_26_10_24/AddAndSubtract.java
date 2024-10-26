package p_26_10_24;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(subtract(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine())));
    }

    private static int sum(int first, int second) {
        return first + second;
    }

    private static int subtract(int first, int second, int third) {
        return sum(first, second) - third;
    }
}
