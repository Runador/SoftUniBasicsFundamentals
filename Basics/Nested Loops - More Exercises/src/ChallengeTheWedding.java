import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        // int reminder = Math.abs(((men * women) * tables) % ((men * women) * tables));
        boolean isFailed = false;

        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                    if (tables > 0) {
                        System.out.printf("(%d <-> %d) ", i, j);
                    } else {
                        isFailed = true;
                        break;
                    }
                    tables--;
            }
            if (isFailed) {
                break;
            }
        }

    }
}