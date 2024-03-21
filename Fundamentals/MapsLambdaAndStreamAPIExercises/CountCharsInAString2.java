package Maps.MapsLambdaAndStreamAPIExercises;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharsInAString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .collect(Collectors.toList());

        Map<String, Integer> stringIntegerMap = new TreeMap<>();

        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            for (int j = 0; j < element.length(); j++) {
                char symbol = element.charAt(j);
                if (!stringIntegerMap.containsKey(String.valueOf(symbol))) {
                    stringIntegerMap.put(String.valueOf(symbol), stringIntegerMap.get(String.valueOf(symbol) + 1));
                }
                stringIntegerMap.put(String.valueOf(symbol), 1);
            }
        }

    }
}
