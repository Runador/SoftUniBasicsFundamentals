package listsMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());

        List<Integer> initialDrumsQuality = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> drumsForRepair = new ArrayList<>(initialDrumsQuality);

        String input = scanner.nextLine();

        while (!input.contains("Hit it again, Gabsy!")) {

            int hitPower = Integer.parseInt(input);

            for (int i = 0; i < initialDrumsQuality.size(); i++) {

                int drum = initialDrumsQuality.get(i);

                if (drum > hitPower) {
                    initialDrumsQuality.set(i, drum -= hitPower);
                } else {

                    // The price is calculated by the formula: {initialQuality} * 3
                    int drumForRepair = drumsForRepair.get(i);

                    if (savings >= drumForRepair * 3) {
                        initialDrumsQuality.set(i, drumForRepair);
                        savings -= drumForRepair * 3;
                    } else {
                        initialDrumsQuality.remove(Integer.valueOf(drum));
                        drumsForRepair.remove(Integer.valueOf(drumForRepair));
                        i--;
                    }

                    // If she doesn't have enough money for a replacement,
                    // the broken drum is removed from the drum set.

                }

            }

            input = scanner.nextLine();
        }

        initialDrumsQuality.forEach(integer -> System.out.print(integer + " "));
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}


