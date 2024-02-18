package FundamentalsMiddleExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            int value = Integer.parseInt(tokens[1]);

            if (command.equals("Add")) {
                numbersList.add(value);
            } else if (command.equals("Remove")) {
                numbersList.remove(Integer.valueOf(value));
            } else if (command.equals("Replace")) {
                int index = numbersList.indexOf(value);
                int replacement = Integer.parseInt(tokens[2]);
                if (numbersList.contains(value)) {
                    if (index >= 0 && index <= numbersList.size() - 1) {
                        numbersList.set(index, replacement);
                    }
                }
                /* "Replace {value} {replacement}" - you should replace the first occurrence of the given value with the
                   replacement if there is such occurrence.
                   5 9 70 -56 9 9
                   Replace 9 10
                   5 10 70 -56 9
                */
            } else if (command.equals("Collapse")) {
                /* "Collapse {value}" you must remove each number with a value less than the given one.
                    1 20 -1 10
                    Collapse 8
                */
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (value > numbersList.get(i)) {
                            numbersList.remove(numbersList.get(i));
                            i--;
                        }
                    }
            }

            input = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
