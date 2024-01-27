import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    for (int l = 1; l <= n; l++) {
                        if ((i + j == k + l) && (n % (i + j) == 0)) {
                            stringBuilder.append(i).append(j).append(k).append(l);
                            if (stringBuilder.length() == 4) {
                                System.out.print(stringBuilder);
                            }
                            stringBuilder = new StringBuilder();
                        }
                    }
                }
            }
        }
    }
}