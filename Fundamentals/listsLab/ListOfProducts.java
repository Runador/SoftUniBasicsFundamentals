package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> numbersList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            numbersList.add(product);
        }

        Collections.sort(numbersList);

        int counter = 1;

        for (String element : numbersList) {
            System.out.println(counter + "." + element);
            counter++;
        }

        // System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
