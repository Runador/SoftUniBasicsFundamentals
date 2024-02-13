package ProgrammingFundamentalsMidExamRetake06;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double daysOfPlunder = Double.parseDouble(scanner.nextLine());
        double dailyPlunder = Double.parseDouble(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double totalPlunder = 0.0;

        for (int i = 1; i <= daysOfPlunder; i++) {
            totalPlunder += dailyPlunder;
            if (i % 3 == 0) {
                totalPlunder += dailyPlunder * 0.5;
            }
            if (i % 5 == 0) {
                totalPlunder -= totalPlunder * 0.3;
            }
        }

        double percent = (totalPlunder / expectedPlunder) * 100;

        if (totalPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", percent);
        }

    }
}
