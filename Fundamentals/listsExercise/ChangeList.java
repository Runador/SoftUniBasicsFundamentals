package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        // Delete {element} - delete all elements in the array which are equal to the given element
        // Insert {element} {position} - insert element at the given position

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            if (command.equals("Delete")) {
                int element = Integer.parseInt(tokens[1]);
                for (int i = 0; i < numbersList.size(); i++) {
                    if (numbersList.contains(element)) {
                        numbersList.remove(Integer.valueOf(element));
                    }
                }
            } else if (command.equals("Insert")) {
                int element = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);
                numbersList.add(position, element);
            }

            input = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
