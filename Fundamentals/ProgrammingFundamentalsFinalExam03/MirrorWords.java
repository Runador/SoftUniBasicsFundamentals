package ProgrammingFundamentalsFinalExam03;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<word>(#[A-Za-z]{3,}##[A-Za-z]{3,}#)|(@[A-Za-z]{3,}@@[A-Za-z]{3,}@))");

        Matcher matcher = pattern.matcher(input);

        List<String> words = new ArrayList<>();
        Map<String, String> mirrorWordsMap = new LinkedHashMap<>();

        int counter = 0;

        while (matcher.find()) {
            String word = matcher.group("word");
            words.add(word);
            counter++;
        }

        for (String word : words) {

            StringBuilder mirroredWord1 = new StringBuilder();
            StringBuilder mirroredWord2 = new StringBuilder();

            for (int i = 0; i < word.length() / 2; i++) {
                char sym = word.charAt(i);
                mirroredWord1.append(sym);
            }

            for (int i = word.length() / 2; i < word.length(); i++) {
                char sym = word.charAt(i);
                mirroredWord2.append(sym);
            }

            String secondWordReversed = mirroredWord2.toString();
            mirroredWord2.reverse();

            String mirroredWord = "";
            for (int i = 0; i < mirroredWord1.length(); i++) {

                char sym1 = mirroredWord1.charAt(i);
                char sym2 = mirroredWord2.charAt(i);
                if (sym1 == sym2) {
                    mirroredWord += sym1;
                }
            }

            if (mirroredWord1.toString().equals(mirroredWord)) {
                mirrorWordsMap.put(mirroredWord1.toString(), secondWordReversed);
            }
        }

        if (counter == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", counter);
        }

        if (mirrorWordsMap.size() != 0) {
            System.out.println("The mirror words are:");

            String keyValueCombinedString = mirrorWordsMap.entrySet().stream().
                    map(entrySet -> entrySet.getKey().replaceAll("[@#]", "")
                            + " <=> "+ entrySet.getValue().replaceAll("[@#]", "")).
                    collect(Collectors.joining(", " , "",""));
            System.out.println(keyValueCombinedString);

        } else {
            System.out.println("No mirror words!");
        }

    }
}
