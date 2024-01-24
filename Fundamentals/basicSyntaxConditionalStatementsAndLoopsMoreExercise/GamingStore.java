import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        double totalSpend = 0.0;
        boolean isNotFound = false;

        String input = scanner.nextLine();

        while (!input.equals("Game Time")) {

            switch (input) {
                case "OutFall 4": price = 39.99; break;
                case "CS: OG": price = 15.99; break;
                case "Zplinter Zell": price = 19.99; break;
                case "Honored 2": price = 59.99; break;
                case "RoverWatch": price = 29.99; break;
                case "RoverWatch Origins Edition": price = 39.99; break;
                default: System.out.println("Not Found"); isNotFound = true;
            }

            if (price > balance) {
                System.out.println("Too Expensive");
            }

            if (!isNotFound && balance >= price) {
                balance -= price;
                totalSpend += price;
                System.out.printf("Bought %s%n", input);
            }

            isNotFound = false;
            input = scanner.nextLine();
        }

        if (balance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, balance);
        } else {
            System.out.println("Out of money!");
        }

    }
}
