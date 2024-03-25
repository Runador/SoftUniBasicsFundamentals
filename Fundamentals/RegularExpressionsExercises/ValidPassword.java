package RegularExpressions.ExerciseRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("(?<password>_(\\.+[A-Z][A-Za-z0-9]{4,}[A-Z]+_\\.+))");

        for (int i = 0; i < n; i++) {

            String password = scanner.nextLine();

            Matcher matcher = pattern.matcher(password);

            if (matcher.find()) {
                String passwordForList = matcher.group("password");
                String output = getGroup(passwordForList);
                System.out.printf("Group: %s%n", output);
            } else {
                System.out.println("Invalid pass!");
            }

        }


    }

    private static String getGroup(String password) {
        String output = "";
        for (int i = 0; i < password.length(); i++) {
            char sym = password.charAt(i);
            if (Character.isDigit(sym)) {
                output += sym;
            }
        }
        if (output.isEmpty()) {
            return "default";
        }
        return output;
    }

}
