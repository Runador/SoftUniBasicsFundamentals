package MoreExerciseLists;

import java.util.*;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());

        List<Integer> initialQuality = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> drumsForRepair = new ArrayList<>(initialQuality);

        String input = scanner.nextLine();

        while (!input.equals("Hit it again, Gabsy!")) {

            int hitPower = Integer.parseInt(input);

            for (int i = 0; i < initialQuality.size(); i++) {

                int drum = initialQuality.get(i);
                initialQuality.set(i, drum - hitPower);

                if (initialQuality.get(i) <= 0) {

                    int newDrum = drumsForRepair.get(i);

                    if (savings >= newDrum * 3) {
                        initialQuality.set(i, newDrum);
                        savings -= (newDrum * 3);
                    } else {
                        initialQuality.remove(initialQuality.get(i));
                        drumsForRepair.remove(drumsForRepair.get(i));
                    }

                }

            }

            input = scanner.nextLine();
        }

        System.out.println(initialQuality.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
