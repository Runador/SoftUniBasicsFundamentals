import java.util.Scanner;

public class SumOfTwoNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;

        for (int i = begin; i <= end; i++) {
            if (isFound) {
                break;
            }
            for (int j = begin; j <= end; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    isFound = true;
                    break;
                }
            }
        }

        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
