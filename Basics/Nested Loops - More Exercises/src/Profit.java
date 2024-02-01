import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ones = Integer.parseInt(scanner.nextLine());
        int twos = Integer.parseInt(scanner.nextLine());
        int fives = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= ones; i++) {
            for (int j = 0; j <= twos; j++) {
                for (int k = 0; k <= fives; k++) {
                    int result = i + (j * 2) + (k * 5);
                    if (sum == result) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n",
                                i, j, k, sum);
                    }
                }
            }
        }

    }
}
