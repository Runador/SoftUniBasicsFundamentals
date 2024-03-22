package RegularExpressions.ExerciseRegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder stringBuilder;

        int attackPlanetsCount = 0;
        int destroyedPlanetsCount = 0;
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        String regex = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<polulation>[0-9]+)[^@\\-!:>]*!(?<attackType>[A|D])![^@\\-!:>]*->(?<soldierCount>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            int countedLetters = countAllLetters(input);
            stringBuilder = new StringBuilder();

            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);
                symbol -= countedLetters;
                stringBuilder.append(symbol);
            }

            Matcher matcher = pattern.matcher(stringBuilder);

            if (matcher.find()) {

                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");

                if (attackType.equals("A")) {
                    attackPlanetsCount++;
                    attackedPlanets.add(planetName);
                } else if (attackType.equals("D")) {
                    destroyedPlanetsCount++;
                    destroyedPlanets.add(planetName);
                }

            }
        }

        System.out.printf("Attacked planets: %d%n", attackPlanetsCount);
        Collections.sort(attackedPlanets);
        attackedPlanets.forEach(e -> System.out.printf("-> %s%n", e));
        Collections.sort(destroyedPlanets);
        System.out.printf("Destroyed planets: %d%n", destroyedPlanetsCount);
        destroyedPlanets.forEach(e -> System.out.printf("-> %s%n", e));

    }

    private static int countAllLetters(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if (letter == 's' || letter == 't' || letter == 'a' || letter == 'r'
            || letter == 'S' || letter == 'T' || letter == 'A' || letter == 'R') {
                counter++;
            }
        }
        return counter;
    }

}
