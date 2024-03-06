package MapsLambdaAndStreamAPILab;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        /*String[] names = scanner.nextLine().split(" ");


        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        Map<String, Integer> namesMap = new LinkedHashMap<>();


        for (String name : names) {
            for (int number : numbers) {
                if (!namesMap.containsKey(name)) {
                    namesMap.put(name, number);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : namesMap.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }*/

        Map<String, List<String>> map = new LinkedHashMap<>();

        List<String> fruits = new ArrayList<>();
        fruits.add("strawberry");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");

        map.put("fruits", fruits);

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.printf("%s -> %s", entry.getKey(), String.join(", ", entry.getValue()));
        }






    }

}

