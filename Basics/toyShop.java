import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sum = (puzzles * 2.6) + (dolls * 3) + (bears * 4.1) + (minions * 8.2) +
                (trucks * 2);
        int toysCounter = puzzles + dolls + bears + minions + trucks;
        if (toysCounter >= 50) {
            sum -= sum * 0.25;
        }
        sum -= sum * 0.1;
        double remainingMoney = Math.abs(sum - excursionPrice);
        if (sum >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", remainingMoney);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", remainingMoney);
        }
    }
}
