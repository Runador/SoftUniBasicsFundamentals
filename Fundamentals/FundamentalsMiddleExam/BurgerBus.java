package FundamentalsMiddleExam;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCities = Integer.parseInt(scanner.nextLine());
        int count = 0;
        double totalProfit = 0.0;

        for (int i = 0; i < numberOfCities; i++) {
            String city = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            count++;

            if (count % 3 == 0 && count % 5 != 0) {
                expenses += expenses * 0.5;
            }

            if (count % 5 == 0) {
                income -= income * 0.1;
            }

            double profit = income - expenses;
            totalProfit += profit;
            System.out.printf("In %s Burger Bus earned %.2f leva.\n", city, profit);
        }

        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}
