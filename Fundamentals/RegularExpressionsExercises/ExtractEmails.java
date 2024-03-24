package RegularExpressions.ExerciseRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // [A-Za-z0-9]+[\.\-_]?[A-Za-z0-9]+

        Pattern pattern = Pattern.compile("(?<email>[A-Za-z0-9]+[\\.\\-_]?[A-Za-z0-9]+?@[A-Za-z0-9]+\\-?[A-Za-z0-9]+(\\.[A-Za-z0-9]+\\-?[A-Za-z0-9]+)+)");

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String email = matcher.group("email");
            System.out.printf("%s%n", email);
        }

    }
}
