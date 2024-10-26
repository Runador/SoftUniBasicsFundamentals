package p_26_10_24;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", calculatePrice(product, quantity));
    }

    private static double calculatePrice(String product, int quantity) {
        double result = 0;
        switch (product) {
            case "coffee" -> result = 1.50 * quantity;
            case "water" -> result = 1.0 * quantity;
            case "coke" -> result = 1.4 * quantity;
            case "snacks" -> result = 2.0 * quantity;
        }
        return result;
    }
}

