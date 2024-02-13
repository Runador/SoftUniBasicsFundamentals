package ProgrammingFundamentalsMidExamRetake06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> warShipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maximumHealthCapacity = Integer.parseInt(scanner.nextLine());

        boolean isSunken = false;

        String input = scanner.nextLine();

        // 12>13>11>20>66
        // 12>22>33>44>55>32>18
        // 70
        // Fire 2 11
        // Fire 8 100

        while (!input.equals("Retire")) {

            String[] tokens = input.split(" ");

            if (tokens[0].equals("Fire")) {
                int index = Integer.parseInt(tokens[1]);
                int damage = Integer.parseInt(tokens[2]);
                if (index >= 0 && index <= warShipStatus.size() - 1) {
                    int section = warShipStatus.get(index);
                    warShipStatus.set(index, section -= damage);
                    if (section <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        isSunken = true;
                        break;
                    }

                }
            } else if (tokens[0].equals("Defend")) {
                // Defend 3 6 11
                //  Defend 0 3 5
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                int damage = Integer.parseInt(tokens[3]);
                if (startIndex >= 0 && endIndex <= pirateShipStatus.size() - 1) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        int section = pirateShipStatus.get(i);
                        pirateShipStatus.set(i, section -= damage);
                        if (section <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            isSunken = true;
                            break;
                        }
                    }
                }
            } else if (tokens[0].equals("Repair")) {
                // Repair 1 33
                int index = Integer.parseInt(tokens[1]);
                int health = Integer.parseInt(tokens[2]);
                if (index >= 0 && index <= pirateShipStatus.size() - 1) {
                    int section = pirateShipStatus.get(index);
                    if (section + health <= maximumHealthCapacity) {
                        pirateShipStatus.set(index, section + health);
                    } else {
                        pirateShipStatus.set(index, maximumHealthCapacity);
                    }
                }
            } else if (tokens[0].equals("Status")) {
                // "{count} sections need repair."
                double twentyPercents = maximumHealthCapacity * 0.2;
                int counter = 0;
                for (int i = 0; i < pirateShipStatus.size(); i++) {
                    if (pirateShipStatus.get(i) < twentyPercents) {
                        counter++;
                    }
                }
                System.out.printf("%d sections need repair.\n", counter);
            }

            input = scanner.nextLine();
        }

        int pirateShipSum = 0;
        for (int element : pirateShipStatus) {
            pirateShipSum += element;
        }
        int warShipSum = 0;
        for (int element : warShipStatus) {
            warShipSum += element;
        }

        if (!isSunken) {
            System.out.printf("Pirate ship status: %d\n", pirateShipSum);
            System.out.printf("Warship status: %d\n", warShipSum);
        }

    }
}
