import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double thirdNumber = Double.parseDouble(scanner.nextLine());
        double maxNumber = 0.0;
        double middleNumber = 0.0;
        double minNumber = 0.0;

        for (int i = 0; i < 3; i++) {
            if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
                maxNumber = firstNumber;
            } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
                maxNumber = secondNumber;
            } else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber){
                maxNumber = thirdNumber;
            }

            if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
                minNumber = firstNumber;
            } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
                minNumber = secondNumber;
            } else if (thirdNumber <= firstNumber && thirdNumber <= secondNumber){
                minNumber = thirdNumber;
            }

            if (firstNumber == maxNumber && secondNumber == minNumber) {
                middleNumber = thirdNumber;
            } else if (secondNumber == maxNumber && thirdNumber == minNumber) {
                middleNumber = firstNumber;
            } else if (firstNumber == minNumber && secondNumber == maxNumber) {
                middleNumber = thirdNumber;
            } else if (secondNumber == minNumber && thirdNumber == maxNumber) {
                middleNumber = firstNumber;
            } else if (firstNumber == maxNumber && thirdNumber == minNumber) {
                middleNumber = secondNumber;
            } else if (firstNumber == minNumber && thirdNumber == maxNumber) {
                middleNumber = secondNumber;
            }
        }

        System.out.printf("%.0f%n%.0f%n%.0f%n", maxNumber, middleNumber, minNumber);
    }
}
