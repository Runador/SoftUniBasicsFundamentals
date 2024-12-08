import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            int number = i;
            int sumEven = 0;
            int sumOdd = 0;
            int counter = 0;
            while (number > 0) {
                int reminder = number % 10;
                if (counter % 2 == 0) {
                    sumEven += reminder;
                } else {
                    sumOdd += reminder;
                }
                number /= 10;
                counter++;
            }
            if (sumEven == sumOdd) {
                System.out.print(i + " ");
            }
        }
    }
}
