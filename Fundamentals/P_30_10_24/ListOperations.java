package P_30_10_24;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            if (command.equals("Add")) {
                integerList.add(Integer.parseInt(tokens[1]));
            } else if (command.equals("Insert")) {
                int number = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < integerList.size()) {
                    integerList.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Remove")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < integerList.size()) {
                    integerList.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Shift") && tokens[1].equals("left")) {
                int count = Integer.parseInt(tokens[2]);
                for (int i = 0; i < count; i++) {
                    int first = integerList.get(0);
                    for (int j = 0; j < integerList.size() - 1; j++) {
                        integerList.set(j, integerList.get(j + 1));
                    }
                    integerList.set(integerList.size() - 1, first);
                }
            } else if (command.equals("Shift") && tokens[1].equals("right")) {
                int count = Integer.parseInt(tokens[2]);
                for (int i = 0; i < count; i++) {
                    int last = integerList.get(integerList.size() - 1);
                    for (int j = integerList.size() - 1; j > 0; j--) {
                        integerList.set(j, integerList.get(j - 1));
                    }
                    integerList.set(0, last);
                }
            }

            input = scanner.nextLine();
        }

        integerList.forEach(integer -> System.out.print(integer + " "));
    }
}
