import java.util.Scanner;

public class lunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double episodeTime = Double.parseDouble(scanner.nextLine());
        double lunchTime = Double.parseDouble(scanner.nextLine());

        double result = lunchTime - ((lunchTime / 8) + (lunchTime / 4));
        if (episodeTime <= result) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    name, Math.abs(episodeTime - result));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    name, Math.abs(episodeTime - result));
        }
    }
}
