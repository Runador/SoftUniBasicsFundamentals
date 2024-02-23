package ObjectsAndClassesExercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsePower = Integer.parseInt(tokens[3]);

            if (type.equals("car")) {
                Car car = new Car("Car", model, color, horsePower);
                cars.add(car);
            } else if (type.equals("truck")) {
                Truck truck = new Truck("Truck", model, color, horsePower);
                trucks.add(truck);
            }

            input = scanner.nextLine();
        }

        double carsSumHorsePower = 0.0;
        double trucksSumHorsePower = 0.0;

        while (!input.equals("Close the Catalogue")) {

            String model = input;

            for (Car car : cars) {
                if (model.equals(car.getModel())) {
                    System.out.println(car);
                }
            }

            for (Truck truck : trucks) {
                if (model.equals(truck.getModel())) {
                    System.out.println(truck);
                }
            }

            input = scanner.nextLine();
        }

        for (Car car : cars) {
            carsSumHorsePower += car.getHorsePower();
        }

        for (Truck truck : trucks) {
            trucksSumHorsePower += truck.getHorsePower();
        }

        double carsAverageHorsePower = carsSumHorsePower / cars.size();
        double trucksAverageHorsePower = trucksSumHorsePower / trucks.size();

        if (!cars.isEmpty()) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carsAverageHorsePower);
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", 0.0);
        }

        if (!trucks.isEmpty()) {
            System.out.printf("Trucks have average horsepower of: %.2f.", trucksAverageHorsePower);
        } else {
            System.out.printf("Trucks have average horsepower of: %.2f.", 0.0);
        }

    }
}
