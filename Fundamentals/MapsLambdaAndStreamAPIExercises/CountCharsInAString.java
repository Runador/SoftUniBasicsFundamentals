package Maps.MapsLambdaAndStreamAPIExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Map<Character, Integer> stringIntegerMap = new LinkedHashMap<>();

        for (String element : input) {

            for (int i = 0; i < element.length(); i++) {
                char symbol = element.charAt(i);

                if (!stringIntegerMap.containsKey(symbol)) {
                    stringIntegerMap.put(symbol, 1);
                } else {
                    int currentCount = stringIntegerMap.get(symbol);
                    stringIntegerMap.put(symbol, currentCount + 1);
                }
            }

        }

        for (Map.Entry<Character, Integer> entry : stringIntegerMap.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}

