package ObjectsAndClassesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal factorial = new BigDecimal(1);

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
        }

        System.out.println(factorial);
    }
}
