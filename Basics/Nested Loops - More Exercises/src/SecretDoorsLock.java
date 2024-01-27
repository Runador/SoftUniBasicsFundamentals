import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hundreds = Integer.parseInt(scanner.nextLine());
        int tens = Integer.parseInt(scanner.nextLine());
        int units = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= hundreds; i++) {
            for (int j = 2; j <= tens; j++) {
                for (int k = 2; k <= units; k++) {
                    if ((i % 2 == 0 && k % 2 == 0) && (j != 4 && j != 6 && j != 8 && j != 9 && j != 10)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
