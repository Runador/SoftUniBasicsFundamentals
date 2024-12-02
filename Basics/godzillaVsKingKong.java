import java.util.Scanner;

public class godzillaVsKingKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int st = Integer.parseInt(scanner.nextLine());
        double clothPerStatistPrice = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double sum = st * clothPerStatistPrice;
        if (st > 150) {
            sum -= sum * 0.1;
        }
        sum += decor;
        double remainingMoney = Math.abs(sum - budget);
        if (sum <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",
                    remainingMoney);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", remainingMoney);
        }
    }
}
