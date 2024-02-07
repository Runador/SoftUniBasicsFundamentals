package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] tokens = input.split(" ");
            String command = tokens[0];
            int number = Integer.parseInt(tokens[1]);

            if (command.equals("Add")) {
                numbersList.add(number);
            } else if (command.equals("Remove")) {
                numbersList.remove(Integer.valueOf(number));
            } else if (command.equals("RemoveAt")) {
                if (numbersList.size() > 0 && number <= numbersList.size() - 1) {
                    numbersList.remove(number);                }
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(tokens[2]);
                if (numbersList.size() > 0 && index <= numbersList.size() - 1) {
                    numbersList.add(index, number);
                }
            }

            input = scanner.nextLine();
        }

        for (int number : numbersList) {
            System.out.print(number + " ");
        }
    }
}
