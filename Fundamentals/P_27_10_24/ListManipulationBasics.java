package P_27_10_24;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");

            if (tokens[0].equals("Add")) {
                integerList.add(Integer.parseInt(tokens[1]));
            } else if (tokens[0].equals("Remove")) {
                integerList.remove(Integer.valueOf(Integer.parseInt(tokens[1])));
            } else if (tokens[0].equals("RemoveAt")) {
                integerList.remove(Integer.parseInt(tokens[1]));
            } else if (tokens[0].equals("Insert")) {
                integerList.add(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[1]));
            }

            command = scanner.nextLine();
        }

        integerList.forEach(integer -> System.out.print(integer + " "));
    }
}
