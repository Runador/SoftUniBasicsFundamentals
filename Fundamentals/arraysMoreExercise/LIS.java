import java.util.Arrays;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] LIS = new int[numbersArray.length];
        Arrays.fill(LIS, 1);

        for (int i = 1; i < numbersArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbersArray[i] > numbersArray[j]) {
                    LIS[i] = Math.max(LIS[i], LIS[j] + 1);
                }
            }
        }

        int longest = 0;
        for (int num : LIS) {
            longest = Math.max(longest, num);
        }
    }
}