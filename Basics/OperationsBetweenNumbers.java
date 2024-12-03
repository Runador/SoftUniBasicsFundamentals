import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double result;

        switch (operator) {
            case "+" -> {
                result = n1 + n2;
                System.out.printf("%.0f + %.0f = %.0f - %s", n1, n2, result, printOddOrEven(result));
            }
            case "-" -> {
                result = n1 - n2;
                System.out.printf("%.0f - %.0f = %.0f - %s", n1, n2, result, printOddOrEven(result));
            }
            case "*" -> {
                result = n1 * n2;
                System.out.printf("%.0f * %.0f = %.0f - %s", n1, n2, result, printOddOrEven(result));
            }
            case "/" -> {
                result = n1 / n2;
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else {
                    System.out.printf("%.0f / %.0f = %.2f", n1, n2, result);
                }
            }
            case "%" -> {
                result = n1 % n2;
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else {
                    System.out.printf("%.0f %% %.0f = %.0f", n1, n2, result);
                }
            }
        }
    }

    private static String printOddOrEven(double result) {
        String evenOrOdd;
        if (result % 2 == 0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }
        return evenOrOdd;
    }
}
