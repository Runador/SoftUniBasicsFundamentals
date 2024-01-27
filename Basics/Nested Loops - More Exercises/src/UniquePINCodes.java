import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte first = Byte.parseByte(scanner.nextLine());
        byte second = Byte.parseByte(scanner.nextLine());
        byte third = Byte.parseByte(scanner.nextLine());

        for (int i = 2; i <= first; i++) {
            for (int j = 2; j <= second; j++) {
                for (int k = 2; k <= third; k++) {
                    if ((i % 2 == 0 && k % 2 == 0) && (j != 4 && j != 6 && j != 8 && j != 9 && j != 10)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
