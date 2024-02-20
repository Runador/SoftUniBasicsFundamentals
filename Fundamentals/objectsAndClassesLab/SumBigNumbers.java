package ObjectsAndClassesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal firstNumber = new BigDecimal(scanner.nextLine());
        BigDecimal secondNumber = new BigDecimal(scanner.nextLine());
        BigDecimal sum = firstNumber.add(secondNumber);
        System.out.println(sum);

    }
}
