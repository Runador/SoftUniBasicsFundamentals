package ProgrammingFundamentalsFinalExam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern1 = Pattern.compile("((?<itemName1>([#][A-Za-z ]+[#]))(?<expirationDate1>(?<day1>[0-9]{2})\\/(?<month1>[0-9]{2})\\/(?<year1>[0-9]{2}))#(?<colories1>[\\d]+)#)");
        Pattern pattern2 = Pattern.compile("((?<itemName2>([\\|][A-Za-z ]+[\\|]))(?<expirationDate2>(?<day2>[0-9]{2})\\/(?<month2>[0-9]{2})\\/(?<year2>[0-9]{2}))\\|(?<colories2>[\\d]+)\\|)");

        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);

        int sumCalories = 0;
        List<String> items = new ArrayList<>();
        List<String> dates = new ArrayList<>();
        List<Integer> nutritions = new ArrayList<>();

        while (matcher1.find()) {
            int calories1 = Integer.parseInt(matcher1.group("colories1"));
            sumCalories += calories1;
            String item = matcher1.group("itemName1");
            String substringItem = item.substring(1, item.length() - 1);
            items.add(substringItem);
            String date = matcher1.group("day1") + "/" + matcher1.group("month1") + "/" + matcher1.group("year1");
            dates.add(date);
            nutritions.add(calories1);
        }

        while (matcher2.find()) {
            int calories2 = Integer.parseInt(matcher2.group("colories2"));
            sumCalories += calories2;
            String item = matcher2.group("itemName2");
            String substringItem = item.substring(1, item.length() - 1);
            items.add(substringItem);
            String date = matcher2.group("day2") + "/" + matcher2.group("month2") + "/" + matcher2.group("year2");
            dates.add(date);
            nutritions.add(calories2);
        }

        // (?<container>(((?<itemName1>([#][A-Za-z ]+[#])|([\|][A-Za-z ]+[\|]))(?<expirationDate>(?<day>[0-9]{2})\/(?<month>[0-9]{2})\/(?<year>[0-9]{2}))#(?<colories>[\d]+)#))|((?<itemName2>([\|][A-Za-z ]+[\|]))(?<expirationDate2>(?<day2>[0-9]{2})\/(?<month2>[0-9]{2})\/(?<year2>[0-9]{2}))\|(?<colories2>[\d]+)\|))

        int days = sumCalories / 2000;

        System.out.printf("You have food to last you for: %s days!%n", days);

        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i);
            String date = dates.get(i);
            int calories = nutritions.get(i);
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", item, date, calories);
        }
    }
}
