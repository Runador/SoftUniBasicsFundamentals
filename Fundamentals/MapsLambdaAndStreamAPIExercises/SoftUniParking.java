package Maps.MapsLambdaAndStreamAPIExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> registeredCars = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] tokens = scanner.nextLine().split(" ");

            String command = tokens[0];
            String username = tokens[1];

            if (command.equals("register")) {
                String licensePlateNumber = tokens[2];

                if (!registeredCars.containsKey(username)) {
                    registeredCars.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n",
                            licensePlateNumber);
                }
            } else if (command.equals("unregister")) {

                if (!registeredCars.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    registeredCars.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }

        for (Map.Entry<String, String> registeredCarEntry : registeredCars.entrySet()) {
            System.out.printf("%s => %s%n", registeredCarEntry.getKey(), registeredCarEntry.getValue());
        }

    }
}
