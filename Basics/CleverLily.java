import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double washingmachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCounter = 0;
        int money = 0;
        int sumMoney = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                money += 10;
                sumMoney += money;
            } else {
                toysCounter++;
            }
        }

        sumMoney -= n / 2 * 1.0;
        sumMoney = sumMoney + (toyPrice * toysCounter);
        if (sumMoney >= washingmachinePrice) {
            System.out.printf("Yes! %.2f", Math.abs(sumMoney - washingmachinePrice));
        } else {
            System.out.printf("No! %.2f", Math.abs(sumMoney - washingmachinePrice));
        }
    }
}
