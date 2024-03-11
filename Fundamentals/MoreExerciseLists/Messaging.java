package MoreExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(input);

        for (int number : numbersList) {
            int sum = 0;
            while (number > 0) {
                int reminder = number % 10;
                sum += reminder;
                number /= 10;
            }
            for (int i = 0; i < stringBuilder.length(); i++) {
                if (sum > stringBuilder.length()) {
                    sum -= stringBuilder.length();
                } else {
                    char symbol = stringBuilder.charAt(sum);
                    System.out.print(symbol);
                    stringBuilder.deleteCharAt(sum);
                    break;
                }
            }
        }
    }
}
