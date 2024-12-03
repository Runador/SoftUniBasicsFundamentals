import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersAmount = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (season.equals("Spring")) {
            price = 3000;
        } else if (season.equals("Summer")) {
            price = 4200;
        } else if (season.equals("Autumn")) {
            price = 4200;
        } else if (season.equals("Winter")) {
            price = 2600;
        }

        if (fishersAmount <= 6) {
            price -= price * 0.1;
        } else if (fishersAmount > 7 && fishersAmount <= 11) {
            price -= price * 0.15;
        } else if (fishersAmount > 12) {
            price -= price * 0.25;
        }

        if (fishersAmount % 2 == 0 && !season.equals("Autumn")) {
            price -= price * 0.05;
        }

        double remindedMoney = Math.abs(budget - price);

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", remindedMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", remindedMoney);
        }
    }
}
