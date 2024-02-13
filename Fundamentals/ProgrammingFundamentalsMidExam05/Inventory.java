package ProgrammingFundamentalsMidExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journalList = Arrays.stream(scanner.nextLine().split(", "))
                        .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {

            String[] tokens = input.split(" - ");
            if (tokens[0].equals("Collect")) {
                String item = tokens[1];
                if (!journalList.contains(item)) {
                    journalList.add(item);
                }
            } else if (tokens[0].equals("Drop")) {
                String item = tokens[1];
                if (journalList.contains(item)) {
                    journalList.remove(item);
                }
            } else if (tokens[0].equals("Combine Items")) {
                String[] elements = tokens[1].split(":");
                String oldItem = elements[0];
                String newItem = elements[1];
                if (journalList.contains(oldItem)) {
                    int oldIndex = journalList.indexOf(oldItem);
                    journalList.add(oldIndex + 1, newItem);
                }
            } else if (tokens[0].equals("Renew")) {
                String item = tokens[1];
                if (journalList.contains(item)) {
                    int index = journalList.indexOf(item);
                    journalList.remove(index);
                    journalList.add(item);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ", journalList));
    }
}
