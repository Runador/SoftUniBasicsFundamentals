package Maps.MapsLambdaAndStreamAPIExercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourcesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {

            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourcesMap.containsKey(resource)) {
                resourcesMap.put(resource, quantity);
            } else {
                resourcesMap.put(resource, resourcesMap.get(resource) + quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
