package ProgrammingFundamentalsFinalExam03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> mileageMap = new LinkedHashMap<>();
        Map<String, Integer> fuelMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\|");
            String car = tokens[0];
            int mileage = Integer.parseInt(tokens[1]);
            int fuel = Integer.parseInt(tokens[2]);

            mileageMap.putIfAbsent(car, mileage);
            fuelMap.putIfAbsent(car, fuel);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            String[] tokens = input.split(" : ");
            String command = tokens[0];
            String car = tokens[1];

            if (command.equals("Drive")) {
                int distance = Integer.parseInt(tokens[2]);
                int fuel = Integer.parseInt(tokens[3]);

                // "Not enough fuel to make that ride"
                // "{car} driven for {distance} kilometers. {fuel} liters of fuel consumed."
                // "Time to sell the {car}!"

                if (mileageMap.containsKey(car) && fuelMap.containsKey(car)) {

                    int carsDistance = mileageMap.get(car);
                    int carsFuel = fuelMap.get(car);

                    if (carsDistance > distance && carsFuel > fuel) {
                        mileageMap.put(car, carsDistance += distance);
                        fuelMap.put(car, carsFuel -= fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                                car, distance, fuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    if (carsDistance >= 100000) {
                        mileageMap.remove(car);
                        fuelMap.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }

                }
            } else if (command.equals("Refuel")) {

                int fuel = Integer.parseInt(tokens[2]);
                int carsFuel = fuelMap.get(car);
                int reminder = 75 - fuelMap.get(car);

                if (fuel + carsFuel < 75) {
                    fuelMap.put(car, carsFuel + fuel);
                    if (fuel + carsFuel != 75) {
                        System.out.printf("%s refueled with %d liters%n", car, fuel);
                    }
                } else {
                    fuelMap.put(car, 75);
                    System.out.printf("%s refueled with %d liters%n", car, reminder);
                }

            } else if (command.equals("Revert")) {

                int kilometers = Integer.parseInt(tokens[2]);

                int mileage = mileageMap.get(car);
                mileageMap.put(car, mileage - kilometers);

                if (mileageMap.get(car) < 10000) {
                    mileageMap.put(car, 10000);
                } else {
                    System.out.printf("%s mileage decreased by %s kilometers%n", car, kilometers);
                }

            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : mileageMap.entrySet()) {

            String car = entry.getKey();
            int mileage = entry.getValue();
            int fuel = fuelMap.get(car);

            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                    car, mileage, fuel);
        }
    }
}
