package p_26_10_24;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int" -> System.out.println(getMax(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
            case "char" -> System.out.println(getMax(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0)));
            case "string" -> System.out.println(getMax(scanner.nextLine(), scanner.nextLine()));
        }
    }

    private static int getMax(int first, int second) {
        return Math.max(first, second);
    }

    private static char getMax(char first, char second) {
        return first > second ? first : second;
    }

    private static String getMax(String first, String second) {
        if (first.compareTo(second) > 0) {
            return first;
        } else {
            return second;
        }
    }
}
