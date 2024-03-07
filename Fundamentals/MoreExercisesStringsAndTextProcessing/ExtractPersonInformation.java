package MoreExercisesStringsAndTextProcessing;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = "";
            int age = 0;

            if (input.contains("@") && input.contains("|")) {
                int beginIndex = input.indexOf('@');
                int endIndex = input.indexOf('|');
                name = input.substring(beginIndex + 1, endIndex);
            }
            if (input.contains("#") && input.contains("*")) {
                int startIndex = input.indexOf('#');
                int endIndex = input.indexOf('*');
                String ageString = input.substring(startIndex + 1, endIndex);
                age = Integer.parseInt(ageString);
            }

            System.out.printf("%s is %d years old.%n", name, age);
            // Write a program that reads n lines of strings and extracts the name and age of a
            // given person. The person's name will be between "@" and "|". The person's age will
            // be between "#" and "*".

            // "{name} is {age} years old."
        }
    }
}
