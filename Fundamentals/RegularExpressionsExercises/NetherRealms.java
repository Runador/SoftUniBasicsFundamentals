package RegularExpressions.ExerciseRegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split("\\s*,\\s*");

        Pattern pattern = Pattern.compile("(?<digit>-?[0-9]+\\.?[0-9]*)");

        for (int i = 0; i < inputArray.length; i++) {
            String input = inputArray[i];

            int demonsTotalHealth = getDemonsTotalHealth(input);

            Matcher matcher = pattern.matcher(input);

            List<Double> digitsArray = new ArrayList<>();

            for (int j = 0; j < input.length(); j++) {
                if (matcher.find()) {
                    double digit = Double.parseDouble(matcher.group("digit"));
                    digitsArray.add(digit);
                }
            }

            double sum = 0;
            for (double digit : digitsArray) {
                sum = sum + (digit);
            }

            List<Character> operators = new ArrayList<>();

            for (int k = 0; k < inputArray.length; k++) {
                String demon = inputArray[k];
                for (int j = 0; j < demon.length(); j++) {
                    char operator = demon.charAt(j);
                    if (operator == '*') {
                        operators.add(operator);
                    } else if (operator == '/') {
                        operators.add(operator);
                    }
                }
            }

            for (Character operator : operators) {
                if (operator == '*') {
                    sum *= 2;
                }
                if (operator == '/') {
                    sum /= 2;
                }
            }

            double damage = sum;

            System.out.printf("%s - %d health, %.2f damage%n", input, demonsTotalHealth, damage);
        }

    }

    private static int getDemonsTotalHealth(String input) {
        int sum = 0;

        for (char symbol : input.toCharArray()) {
            if (!Character.isDigit(symbol) && symbol != '+' && symbol != '-' && symbol != '*' && symbol != '.' && symbol != '/') {
                sum += symbol;
            }
        }

        return sum;
    }

}
