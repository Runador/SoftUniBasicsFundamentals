import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());

        double price = 0;
        boolean isFailed = false;

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                switch (product) {
                    case "banana" -> price = 2.5;
                    case "apple" -> price = 1.2;
                    case "orange" -> price = 0.85;
                    case "grapefruit" -> price = 1.45;
                    case "kiwi" -> price = 2.7;
                    case "pineapple" -> price = 5.5;
                    case "grapes" -> price = 3.85;
                    default -> { System.out.println("error"); isFailed = true; }
                }
                break;
            case "Saturday", "Sunday":
                switch (product) {
                    case "banana" -> price = 2.7;
                    case "apple" -> price = 1.25;
                    case "orange" -> price = 0.90;
                    case "grapefruit" -> price = 1.6;
                    case "kiwi" -> price = 3;
                    case "pineapple" -> price = 5.6;
                    case "grapes" -> price = 4.2;
                    default -> { System.out.println("error"); isFailed = true; }
                }
                break;
            default : { System.out.println("error"); isFailed = true; }
        }

        if (!isFailed)
        System.out.printf("%.2f", price * amount);
    }
}
