package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] tokens = input.split(" ");
            String command = tokens[0];

            if (command.equals("Contains")) {
                int number = Integer.parseInt(tokens[1]);
                if (numbersList.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.equals("Print")) {
                String command2 = tokens[1];
                if (command2.equals("even")) {
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (numbersList.get(i) % 2 == 0) {
                            System.out.print(numbersList.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (command2.equals("odd")) {
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (numbersList.get(i) % 2 == 1) {
                            System.out.print(numbersList.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (command.equals("Get") && tokens[1].equals("sum")) {
                int sum = 0;
                for (int i = 0; i < numbersList.size(); i++) {
                    sum += numbersList.get(i);
                }
                System.out.println(sum);
            } else if (command.equals("Filter")) {
                String condition = tokens[1];
                int number = Integer.parseInt(tokens[2]);
                if (condition.equals(">")) {
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (number < numbersList.get(i)) {
                            System.out.print(numbersList.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals("<")) {
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (number > numbersList.get(i)) {
                            System.out.print(numbersList.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals(">=")) {
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (number <= numbersList.get(i)) {
                            System.out.print(numbersList.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals("<=")) {
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (number >= numbersList.get(i)) {
                            System.out.print(numbersList.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
            }

            input = scanner.nextLine();
        }
    }
}
