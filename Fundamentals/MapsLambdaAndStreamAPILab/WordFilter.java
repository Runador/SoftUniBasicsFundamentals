package MapsLambdaAndStreamAPILab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = Arrays.stream(scanner.nextLine().split(" "))
                .filter(word -> word.length() % 2 == 0).toArray(String[]::new);
        Arrays.stream(strings).forEach(System.out::println);
    }

}
