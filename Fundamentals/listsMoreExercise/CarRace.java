package listsMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> carRaceArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int middleOfList = carRaceArray.size() / 2;
        double firstCarTimeSum = 0;
        double secondCarTimeSum = 0;

        for (int i = 0; i < middleOfList; i++) {
            int firstCarTime = carRaceArray.get(i);
            firstCarTimeSum += firstCarTime;
            if (carRaceArray.get(i) == 0) {
                firstCarTimeSum -= (firstCarTimeSum * 0.2);
            }
        }

        for (int i = middleOfList + 1; i <= carRaceArray.size() - 1; i++) {
            int secondCarTime = carRaceArray.get(i);
            secondCarTimeSum += secondCarTime;
            if (carRaceArray.get(i) == 0) {
                secondCarTimeSum -= (secondCarTimeSum * 0.2);
            }
        }

        if (firstCarTimeSum <= secondCarTimeSum) {
            System.out.printf("The winner is left with total time: %.1f", firstCarTimeSum);
        } else {
            System.out.printf("The winner is right with total time: %.1f", secondCarTimeSum);
        }
    }
}
