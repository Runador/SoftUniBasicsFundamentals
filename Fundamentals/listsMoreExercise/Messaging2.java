package listsMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String inputString = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(inputString);

        for (int number : numbersList) {
            int sum = 0;
            while (number != 0) {
                int reminder = number % 10;
                sum += reminder;
                number /= 10;
            }

            for (int i = 0; i < stringBuilder.length(); i++) {

                if (sum > stringBuilder.length()) {
                    sum = sum - stringBuilder.length();
                }

                char element = stringBuilder.charAt(sum);
                System.out.print(element);
                stringBuilder.deleteCharAt(sum);
                break;
            }

        }

    }
}
