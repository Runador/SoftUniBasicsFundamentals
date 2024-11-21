import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder().append(input);

        int sum;

        for (int number : numbers) {
            sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            if (sum > stringBuilder.length()) {
                sum -= stringBuilder.length();
            }


            System.out.print(stringBuilder.charAt(sum));
            stringBuilder.deleteCharAt(sum);
        }


    }
}
