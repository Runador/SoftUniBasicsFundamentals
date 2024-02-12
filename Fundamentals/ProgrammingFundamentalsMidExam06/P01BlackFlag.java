package ProgrammingFundamentalsMidExamRetake06;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double daysOfPlunder = Double.parseDouble(scanner.nextLine());
        double dailyPlunder = Double.parseDouble(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double sum = 0.0;

        for (int i = 1; i <= daysOfPlunder; i++) {
            if (i % 3 == 0) {
                sum += dailyPlunder + dailyPlunder * 0.5;
            } else if (i % 5 == 0) {
                sum += dailyPlunder;
                sum -= sum * 0.3;
            } else {
                sum += dailyPlunder;
            }
        }

        double percent = (sum / expectedPlunder) * 100;

        if (sum >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", sum);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", percent);
        }

    }
}
