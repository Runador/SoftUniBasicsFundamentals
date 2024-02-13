package ProgrammingFundamentalsMidExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialHealth = 100;
        int initialBitcoins = 0;
        List<String> dungeonRooms = Arrays.stream(scanner.nextLine().split("\\|"))
                        .collect(Collectors.toList());
        boolean isNotFinishedGame = false;

        for (int i = 0; i < dungeonRooms.size(); i++) {
            String[] tokens = dungeonRooms.get(i).split(" ");
            String command = tokens[0];
            int number = Integer.parseInt(tokens[1]);
            if (command.equals("potion")) {
                int currentHealth = initialHealth;
                int reminder = 0;
                if (number < initialHealth) {
                    if (currentHealth + number > 100) {
                        initialHealth = 100;
                        reminder = initialHealth - currentHealth;
                        System.out.printf("You healed for %d hp.\n", reminder);
                    } else {
                        initialHealth += number;
                        System.out.printf("You healed for %d hp.\n", number);
                    }
                }
                System.out.printf("Current health: %d hp.\n", initialHealth);
            } else if (command.equals("chest")) {
                initialBitcoins += number;
                System.out.printf("You found %d bitcoins.\n", number);
            } else {
                String monsterName = command;
                initialHealth -= number;
                if (initialHealth > 0) {
                    System.out.printf("You slayed %s.\n", monsterName);
                } else {
                    System.out.printf("You died! Killed by %s.\n", monsterName);
                    System.out.printf("Best room: %d", i + 1);
                    isNotFinishedGame = true;
                    break;
                }
            }
        }

        if (!isNotFinishedGame) {
            System.out.printf("You've made it!\nBitcoins: %d\nHealth: %d", initialBitcoins, initialHealth);
        }

    }
}
