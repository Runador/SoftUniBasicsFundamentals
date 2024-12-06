import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String destination = input;
            double targetMoney = Double.parseDouble(scanner.nextLine());
            while (sum <= targetMoney) {
                double money = Double.parseDouble(scanner.nextLine());
                sum += money;
                if (sum >= targetMoney) {
                    System.out.printf("Going to %s!%n", destination);
                    sum = 0;
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }
}
