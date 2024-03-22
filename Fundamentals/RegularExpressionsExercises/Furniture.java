package RegularExpressions.ExerciseRegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = 0.0;

        List<String> furnitureList = new ArrayList<>();

        Pattern pattern = Pattern.compile(">>(?<furniture>\\w+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)");

        String input = scanner.nextLine();

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double moneyCost = price * quantity;
                totalMoney += moneyCost;
                furnitureList.add(furniture);
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalMoney);
    }
}
