package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxWagonsCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            if (tokens[0].equals("Add")) {
                int passengers = Integer.parseInt(tokens[1]);
                wagonsList.add(passengers);
            } else {
                int number = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagonsList.size(); i++) {
                    int element = wagonsList.get(i);
                    if (element + number <= maxWagonsCapacity) {
                        wagonsList.set(i, element + number);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
