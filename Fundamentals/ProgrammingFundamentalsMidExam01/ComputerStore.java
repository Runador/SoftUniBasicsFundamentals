package ProgrammingFundamentalsMidExam01;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double priceWithoutTaxes = 0;
        double taxes = 0;
        double totalPrice = 0;

        while (!input.equals("regular") && !input.equals("special")) {

            double partPrice = Double.parseDouble(input);
            if (partPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                priceWithoutTaxes += partPrice;
            }

            input = scanner.nextLine();

            if (input.equals("regular")) {
                taxes = priceWithoutTaxes * 0.2;
                totalPrice += priceWithoutTaxes + taxes;
                break;
            } else if (input.equals("special")) {
                taxes = priceWithoutTaxes * 0.2;
                totalPrice = (priceWithoutTaxes + taxes) - ((priceWithoutTaxes + taxes) * 0.1);
                break;
            }
        }

        if (totalPrice > 0) {
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\nTaxes: %.2f$\n-----------\nTotal price: %.2f$",
                    priceWithoutTaxes, taxes, totalPrice);
        } else {
            System.out.println("Invalid order!");
        }
    }
}
