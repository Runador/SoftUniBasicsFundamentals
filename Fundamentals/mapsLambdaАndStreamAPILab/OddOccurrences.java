package MapsLambdaAndStreamAPILab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");

        Map<String, Integer> elementsMap = new LinkedHashMap<>();

        for (String word : elements) {
            String wordInLowerCase = word.toLowerCase();
            if (elementsMap.containsKey(wordInLowerCase)) {
                elementsMap.put(wordInLowerCase, elementsMap.get(wordInLowerCase) + 1);
            } else {
                elementsMap.put(wordInLowerCase, 1);
            }
        }

        List<String> stringList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : elementsMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                stringList.add(entry.getKey());
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            if (i == stringList.size() - 1) {
                System.out.print(element);
            } else {
                System.out.print(element + ", ");
            }
        }

    }
}
