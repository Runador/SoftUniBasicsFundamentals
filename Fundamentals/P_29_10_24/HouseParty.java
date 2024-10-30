package P_29_10_24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            if (tokens[2].equals("going!")) {
                if (!personList.contains(name)) {
                    personList.add(name);
                } else {
                    System.out.printf("%s is already in the list!%n", name);
                }
            } else if (tokens[2].equals("not")) {
                if (!personList.contains(name)) {
                    System.out.printf("%s is not in the list!%n", name);
                }
                personList.remove(name);
            }
        }

        personList.forEach(System.out::println);
    }
}
