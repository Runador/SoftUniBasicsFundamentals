import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowersAmount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double price = 0;

        switch (flowerType) {
            case "Roses" -> price = 5;
            case "Dahlias" -> price = 3.8;
            case "Tulips" -> price = 2.8;
            case "Narcissus" -> price = 3;
            case "Gladiolus" -> price = 2.5;
        }

        double sum = price * flowersAmount;

        if (flowerType.equals("Roses") && flowersAmount > 80) {
            sum -= sum * 0.1;
        } else if (flowerType.equals("Dahlias") && flowersAmount > 90) {
            sum -= sum * 0.15;
        } else if (flowerType.equals("Tulips") && flowersAmount > 80) {
            sum -= sum * 0.15;
        } else if (flowerType.equals("Narcissus") && flowersAmount < 120) {
            sum += sum * 0.15;
        } else if (flowerType.equals("Gladiolus") && flowersAmount < 80) {
            sum += sum * 0.2;
        }

        double remindedMoney = Math.abs(sum - budget);

        if (budget >= sum) {
            System.out.printf("Hey, you have a great garden with %d " +
                            "%s and %.2f leva left.",
                    flowersAmount, flowerType, remindedMoney );
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", remindedMoney );
        }
    }
}
