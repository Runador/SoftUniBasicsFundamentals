import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double amountOfSales = Double.parseDouble(scanner.nextLine());
        double commission = 0;
        boolean isFailed = false;

        switch (city) {
            case "Sofia" -> {
                if (amountOfSales >= 0 && amountOfSales <= 500) {
                    commission = 5;
                } else if (amountOfSales > 500 && amountOfSales <= 1000) {
                    commission = 7;
                } else if (amountOfSales > 1000 && amountOfSales <= 10000) {
                    commission = 8;
                } else if (amountOfSales > 10000){
                    commission = 12;
                } else {
                    { System.out.println("error"); isFailed = true; }
                }
            }
            case "Varna" -> {
                if (amountOfSales >= 0 && amountOfSales <= 500) {
                    commission = 4.5;
                } else if (amountOfSales > 500 && amountOfSales <= 1000) {
                    commission = 7.5;
                } else if (amountOfSales > 1000 && amountOfSales <= 10000) {
                    commission = 10;
                } else if (amountOfSales > 10000){
                    commission = 13;
                } else {
                    { System.out.println("error"); isFailed = true; }
                }
            }
            case "Plovdiv" -> {
                if (amountOfSales >= 0 && amountOfSales <= 500) {
                    commission = 5.5;
                } else if (amountOfSales > 500 && amountOfSales <= 1000) {
                    commission = 8;
                } else if (amountOfSales > 1000 && amountOfSales <= 10000) {
                    commission = 12;
                } else if (amountOfSales > 10000){
                    commission = 14.5;
                } else {
                    System.out.println("error");
                }
            }
            default -> { System.out.println("error"); isFailed = true; }
        }

        if (!isFailed)
        System.out.printf("%.2f", amountOfSales * commission / 100);
    }
}
