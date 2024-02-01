import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (char first = 'a'; first < 'a' + l; first++) {
                    for (char second = 'a'; second < 'a' + l; second++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                System.out.printf("%d%d%c%c%d ", i, j, first, second, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
