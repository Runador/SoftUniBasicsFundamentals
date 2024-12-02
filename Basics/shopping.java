import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int V = Integer.parseInt(scanner.nextLine());
        int P = Integer.parseInt(scanner.nextLine());
        int R = Integer.parseInt(scanner.nextLine());

        double v = 250 * V;
        double p = v * 0.35;
        double r = v * 0.1;
        double sum = v + p * P + r * R;
        if (V > P) {
            sum -= sum * 0.15;
        }
        if (budget >= sum) {
            System.out.printf("You have %.2f leva left!", Math.abs(budget - sum));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - sum));
        }
    }
}
