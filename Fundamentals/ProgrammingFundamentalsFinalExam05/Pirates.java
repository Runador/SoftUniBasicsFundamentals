package ProgrammingFundamentalsFinalExam05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> populationMap = new LinkedHashMap<>();
        Map<String, Integer> goldMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Sail")) {

            String[] tokens = input.split("[|]+");
            String city = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);

            if (!populationMap.containsKey(city)) {
                populationMap.put(city, population);
            } else {
                populationMap.put(city, populationMap.get(city) + population);
            }
            if (!goldMap.containsKey(city)) {
                goldMap.put(city, gold);
            } else {
                goldMap.put(city, goldMap.get(city) + gold);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split("=>");
            String event = tokens[0];
            String town = tokens[1];

            if (event.equals("Plunder")) {

                int people = Integer.parseInt(tokens[2]);
                int gold = Integer.parseInt(tokens[3]);

                int population = populationMap.get(town);
                population -= people;
                populationMap.put(town, population);

                int goldInCity = goldMap.get(town);
                goldInCity -= gold;
                goldMap.put(town, goldInCity);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                        town, gold, people);

                if (population <= 0 || goldInCity <= 0) {
                    populationMap.remove(town);
                    goldMap.remove(town);
                    System.out.printf("%s has been wiped off the map!%n", town);
                }

            } else if (event.equals("Prosper")) {

                int gold = Integer.parseInt(tokens[2]);
                int goldInCity = goldMap.get(town);

                if (gold > 0) {
                    goldMap.put(town, goldInCity + gold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                            gold, town, goldMap.get(town));
                } else {
                    System.out.println("Gold added cannot be a negative number!");
                }
            }

            input = scanner.nextLine();
        }

        if (!populationMap.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",
                    populationMap.size());
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

        for (Map.Entry<String, Integer> populationEntry : populationMap.entrySet()) {

            String city = populationEntry.getKey();
            int population = populationEntry.getValue();
            int gold = goldMap.get(city);

            if (!populationMap.isEmpty() && !goldMap.isEmpty()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                        city, population, gold);
            }
        }
    }
}
