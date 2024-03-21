package Maps.MapsLambdaAndStreamAPIExercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<Character, Integer> occurrencesMap = new LinkedHashMap<>();

        for (String word : input) {

            for (int j = 0; j < word.length(); j++) {

                char letter = word.charAt(j);

                if (!occurrencesMap.containsKey(letter)) {
                    occurrencesMap.put(letter, 1);
                } else {
                    occurrencesMap.put(letter, occurrencesMap.get(letter) + 1);
                }
            }

        }

        // t -> 2

        for (Map.Entry<Character, Integer> pair : occurrencesMap.entrySet()) {
            System.out.printf("%c -> %d%n", pair.getKey(), pair.getValue());
        }
    }
}
