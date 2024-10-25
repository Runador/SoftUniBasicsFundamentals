package P_25_10_24;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();
        boolean isBigger = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    isBigger = false;
                    break;
                } else {
                    isBigger = true;
                }
            }

            if (isBigger) {
                System.out.print(numbers[i] + " ");
            }
        }
        // 1 4 3 2
        System.out.println(numbers[numbers.length - 1]);
    }
}
