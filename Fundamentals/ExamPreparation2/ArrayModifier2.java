import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            if (command.equals("decrease")) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] -= 1;
                }
            } else if (command.equals("swap")) {
                int index1 = Integer.parseInt(tokens[1]);
                int index2 = Integer.parseInt(tokens[2]);
                int first = numbers[index1];
                numbers[index1] = numbers[index2];
                numbers[index2] = first;
            } else if (command.equals("multiply")) {
                int index1 = Integer.parseInt(tokens[1]);
                int index2 = Integer.parseInt(tokens[2]);
                numbers[index1] = numbers[index1] * numbers[index2];
            }

            input = scanner.nextLine();
        }

        System.out.println(Arrays.toString(numbers)
                .replace("[", "").replace("]", ""));
    }
}
