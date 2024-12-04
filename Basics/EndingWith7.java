import java.util.Scanner;

public class EndingWith7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*for (int i = 1; i <= 1000; i++) {
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }*/

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > max) {
                max = number;
            }
            sum += number;
        }

        if (sum - max == max) {
            System.out.println("Yes");
            System.out.println("Sum = " + (sum - max));
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(max - (sum - max)));
        }

    }
}








