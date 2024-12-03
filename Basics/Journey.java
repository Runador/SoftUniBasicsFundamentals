import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String place = "";
        double price = 0;

        if (season.equals("summer")) {
            place = "Camp";
            if (budget <= 100) {
                destination = "Bulgaria";
                price = budget * 0.3;
            } else if (budget <= 1000) {
                destination = "Balkans";
                price = budget * 0.4;
            } else if (budget > 1000) {
                place = "Hotel";
                destination = "Europe";
                price = budget * 0.9;
            }
        } else if (season.equals("winter")) {
            place = "Hotel";
            if (budget <= 100) {
                destination = "Bulgaria";
                price = budget * 0.7;
            } else if (budget <= 1000) {
                destination = "Balkans";
                price = budget * 0.8;
            } else if (budget > 1000) {
                destination = "Europe";
                price = budget * 0.9;
            }
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, price);
    }
}
