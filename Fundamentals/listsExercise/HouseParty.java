package ListsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCounter = Integer.parseInt(scanner.nextLine());

        List<String> namesList = new ArrayList<>();

        for (int i = 0; i < commandsCounter; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];

            if (input.equals(name + " is going!")) {
                if (namesList.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    namesList.add(name);
                }
            } else if (input.equals(name + " is not going!")) {
                if (namesList.contains(name)) {
                    namesList.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }

        if (!namesList.isEmpty()) {
            for (String name : namesList) {
                System.out.println(name);
            }
        }
    }
}