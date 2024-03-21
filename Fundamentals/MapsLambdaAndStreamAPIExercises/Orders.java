package Maps.MapsLambdaAndStreamAPIExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> priceMap = new LinkedHashMap<>();
        Map<String, Integer> quantityMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {

            String[] tokens = input.split(" ");

            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (!priceMap.containsKey(product)) {
                priceMap.put(product, price);
            } else {
                priceMap.replace(product, price);
            }
            if (!quantityMap.containsKey(product)) {
                quantityMap.put(product, quantity);
            } else {
                quantityMap.put(product, quantityMap.get(product) + quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> priceEntry : priceMap.entrySet()) {
            String product = priceEntry.getKey();
            double price = priceEntry.getValue();
            int quantity = quantityMap.get(product);
            double result = price * quantity;
            System.out.printf("%s -> %.2f%n", priceEntry.getKey(), result);
        }

    }
}
