package P_28_10_24;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            if (tokens[0].equals("Add")) {
                int wagon = Integer.parseInt(tokens[1]);
                wagons.add(wagon);
            } else {
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + Integer.parseInt(tokens[0]) <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + Integer.parseInt(tokens[0 ]));
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }

        wagons.forEach(wagon -> System.out.print(wagon + " "));
    }
}
