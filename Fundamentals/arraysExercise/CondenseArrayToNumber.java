import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        while (numbersArray.length != 1) {

            int[] condensedArray = new int[numbersArray.length - 1];

            for (int i = 0; i < numbersArray.length - 1; i++) {
                condensedArray[i] = numbersArray[i] + numbersArray[i + 1];
            }

            numbersArray = condensedArray;
        }

        System.out.println(numbersArray[0]);
    }
}
