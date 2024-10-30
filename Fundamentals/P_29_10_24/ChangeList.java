package P_29_10_24;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] tokens = input.split("\\s+");
            if (tokens[0].equals("Delete")) {
                if (integerList.contains(Integer.valueOf(tokens[1]))) {
                    for (int i = 0; i < integerList.size(); i++) {
                        integerList.remove(Integer.valueOf(tokens[1]));
                    }
                }
            } else if (tokens[0].equals("Insert")) {
                int element = Integer.parseInt(tokens[1]);
                int position = Integer.parseInt(tokens[2]);
                integerList.add(position, element);
            }

            input = scanner.nextLine();
        }
        integerList.forEach(integer -> System.out.print(integer + " "));
    }
}
