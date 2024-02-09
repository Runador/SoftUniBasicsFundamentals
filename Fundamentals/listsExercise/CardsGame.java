package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {

            int first = firstDeck.get(0);
            int second = secondDeck.get(0);
            firstDeck.remove(0);
            secondDeck.remove(0);

            if (first > second) {
                firstDeck.add(first);
                firstDeck.add(second);
            } else if (second > first) {
                secondDeck.add(second);
                secondDeck.add(first);
            }
        }

        if (!firstDeck.isEmpty()) {
            int sum = firstDeck.stream().mapToInt(Integer::valueOf).sum();
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            int sum = secondDeck.stream().mapToInt(Integer::valueOf).sum();
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
