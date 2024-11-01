package P_01_11_24.vehicle_catalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();

        double carSum = 0;
        double truckSum = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("car")) {
                cars.add(new Car(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3])));
                carSum += Integer.parseInt(tokens[3]);
            } else if (tokens[0].equals("truck")) {
                trucks.add(new Truck(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3])));
                truckSum += Integer.parseInt(tokens[3]);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {

            for (Car car : cars) {
                if (input.equals(car.getModel())) {
                    System.out.println(car);
                }
            }
            for (Truck truck : trucks) {
                if (input.equals(truck.getModel())) {
                    System.out.println(truck);
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", carSum / cars.size());
        System.out.printf("Trucks have average horsepower of: %.2f.", truckSum / trucks.size());
    }
}
