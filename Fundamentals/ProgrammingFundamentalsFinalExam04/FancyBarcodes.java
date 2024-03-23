package ProgrammingFundamentalsFinalExam04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        Pattern pattern = Pattern.compile("@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+");

        for (int i = 0; i < n; i++) {

            String regex = scanner.nextLine();

            Matcher matcher = pattern.matcher(regex);

            String result = getDigitsAsString(regex);

            if (matcher.find()) {
                System.out.printf("Product group: %s%n", result);
            } else {
                System.out.println("Invalid barcode");
            }

        }

    }

    private static String getDigitsAsString(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char sym = input.charAt(i);
            if (Character.isDigit(sym)) {
                result += sym;
            }
        }

        if (result.isEmpty()) {
            return "00";
        }
        return result;
    }
}
