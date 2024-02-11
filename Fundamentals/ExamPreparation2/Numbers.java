import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;
        Arrays.sort(numbers);

        for (int i = numbers.length - 1; i >= numbers.length - 5; i--) {
            if (numbers.length == 1) {
                System.out.println("No");
                break;
            }
            if (numbers[i] >= average) {
                System.out.print(numbers[i] + " ");
            }
        }

    }

}
