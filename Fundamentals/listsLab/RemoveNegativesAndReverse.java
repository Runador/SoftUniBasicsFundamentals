package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> positiveNumbers = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) > 0) {
                positiveNumbers.add(numbersList.get(i));
            }
        }
        if (positiveNumbers.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(positiveNumbers);
            System.out.println(positiveNumbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
