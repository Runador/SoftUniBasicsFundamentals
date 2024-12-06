import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean isFounded = false;
        int counter = 0;

        for (int i = begin; i <= end; i++) {
            if (isFounded) {
                break;
            }
            for (int j = begin; j <= end; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)",
                            counter, i, j, i + j);
                    isFounded = true;
                    break;
                }
            }
        }

        if (!isFounded) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
