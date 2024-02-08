package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if (command.equals("Add")) {
                int number = Integer.parseInt(tokens[1]);
                numbersList.add(number);
            } else if (command.equals("Insert")) {
                int number = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < numbersList.size()) {
                    numbersList.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < numbersList.size()) {
                    numbersList.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Shift")) {
                int count = Integer.parseInt(tokens[2]);
                if (tokens[1].equals("left")) {
                    for (int i = 0; i < count; i++) {
                        int first = numbersList.get(0);
                        numbersList.add(first);
                        numbersList.remove(numbersList.get(0));
                    }
                } else if (tokens[1].equals("right")) {
                    for (int i = 0; i < count; i++) {
                        int last = numbersList.get(numbersList.size() - 1);
                        numbersList.add(0, last);
                        numbersList.remove(numbersList.size() - 1);
                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
