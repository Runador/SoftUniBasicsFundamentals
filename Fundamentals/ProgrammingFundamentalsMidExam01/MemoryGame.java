package ProgrammingFundamentalsMidExam01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .collect(Collectors.toList());
        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            int firstIndex = Integer.parseInt(tokens[0]);
            int secondIndex = Integer.parseInt(tokens[1]);
            count++;
            if ((firstIndex == secondIndex) || (firstIndex < 0 || firstIndex > elements.size() - 1)
                || (secondIndex < 0 || secondIndex > elements.size() - 1)) {
                elements.add(elements.size() / 2, "-" + count + "a");
                elements.add(elements.size() / 2, "-" + count + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            } else if (elements.get(firstIndex).equals(elements.get(secondIndex))) {
                System.out.printf("Congrats! You have found matching elements - %s!\n", elements.get(firstIndex));
                if (secondIndex >= 1) {
                    elements.remove(secondIndex);
                    elements.remove(firstIndex);
                } else {
                    elements.remove(firstIndex);
                    elements.remove(secondIndex);
                }
            } else {
                System.out.println("Try again!");
            }

            input = scanner.nextLine();

            if (elements.isEmpty()) {
                System.out.printf("You have won in %d turns!", count);
                break;
            }
        }

        if (!elements.isEmpty()) {
            System.out.println("Sorry you lose :(");
            System.out.println(elements.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
