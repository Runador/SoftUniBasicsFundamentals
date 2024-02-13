package ProgrammingFundamentalsMidExamRetake06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLoot = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {

            String[] tokens = input.split(" ");

            if (tokens[0].equals("Loot")) {
                for (int i = 1; i <= tokens.length - 1; i++) {
                    String item = tokens[i];
                    if (!initialLoot.contains(item)) {
                        initialLoot.add(0, item); // adding an element in the beginning of the chest
                    }
                }
            } else if (tokens[0].equals("Drop")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index <= initialLoot.size() - 1) {
                    String element = initialLoot.get(index);
                    initialLoot.remove(index);
                    initialLoot.add(element);   // removing the element of the given position and adding it in the end
                }
            } else if (tokens[0].equals("Steal")) {
                int count = Integer.parseInt(tokens[1]);
                    for (int i = initialLoot.size() - count; i < initialLoot.size(); i++) {
                        if (i != initialLoot.size() - 1) {
                            System.out.print(initialLoot.get(i) + ", ");
                        } else {
                            System.out.print(initialLoot.get(initialLoot.size() - 1));
                        }
                    }
                    for (int i = 0; i < count; i++) {
                        initialLoot.remove(initialLoot.size() - 1);
                    }
            }

            input = scanner.nextLine();
        }

        double averageTreasureGain = 0.0;

        for (String element : initialLoot) {
            averageTreasureGain += element.length();
        }

        averageTreasureGain = averageTreasureGain / initialLoot.size();

        if (!initialLoot.isEmpty()) {
            System.out.printf("\nAverage treasure gain: %.2f pirate credits.", averageTreasureGain);
        } else {
            System.out.println("\nFailed treasure hunt.");
        }
    }
}
