import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int leftSum;
        int rightSum;
        boolean areEqual = false;

        for (int position = 0; position < numbersArray.length; position++) {

            leftSum = 0;
            rightSum = 0;

            for (int i = 0; i < position; i++) {
                leftSum += numbersArray[i];
            }

            for (int i = position + 1; i < numbersArray.length; i++) {
                rightSum += numbersArray[i];
            }

            if (leftSum == rightSum) {
                System.out.println(position);
                areEqual = true;
                break;
            }
        }

        if (!areEqual) {
            System.out.println("no");
        }
    }
}
