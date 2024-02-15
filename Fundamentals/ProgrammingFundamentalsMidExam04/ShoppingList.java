package ProgrammingFundamentalsMidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialList = Arrays.stream(scanner.nextLine().split("!"))
                        .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            if (command.equals("Urgent")) {
                String item = tokens[1];
                if (!initialList.contains(item)) {
                    initialList.add(0, item);
                }
            } else if (command.equals("Unnecessary")) {
                String item = tokens[1];
                if (initialList.contains(item)) {
                    initialList.remove(item);
                }
            } else if (command.equals("Correct")) {
                String oldItem = tokens[1];
                String newItem = tokens[2];
                if (initialList.contains(oldItem)) {
                    initialList.set(initialList.indexOf(oldItem), newItem);
                }
            } else if (command.equals("Rearrange")) {
                String item = tokens[1];
                if (initialList.contains(item)) {
                    initialList.remove(item);
                    initialList.add(item);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(initialList.toString().replaceAll("[\\[\\]]", ""));
    }
}
