import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        int foundedNumber = 0;

        for (int i = start; i <= end; i++) {
            if (isFound) {
                break;
            }
            for (int j = start; j <= end; j++) {
                foundedNumber++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", foundedNumber, i, j, magicNumber);
                    isFound = true;
                    break;
                }
            }
        }

        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d%n", foundedNumber, magicNumber);
        }
    }

}
