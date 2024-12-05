import java.util.Scanner;

public class Vacation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double goalMoney = Double.parseDouble(scanner.nextLine());
        double cash = Double.parseDouble(scanner.nextLine());
        int failedDaysCounter = 0;
        int daysCounter = 0;
        boolean areMoneyCollected = false;

        while (failedDaysCounter != 5) {
            String input = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            if (input.equals("spend")) {
                cash -= money;
                if (cash < 0) {
                    cash = 0;
                }
                failedDaysCounter++;
            } else if (input.equals("save")) {
                cash += money;
                failedDaysCounter = 0;
            }
            daysCounter++;
            if (cash >= goalMoney) {
                System.out.printf("You saved the money for %d days.", daysCounter);
                areMoneyCollected = true;
                break;
            }
        }

        if (!areMoneyCollected){
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }
    }
}
