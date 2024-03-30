package ProgrammingFundamentalsFinalExam01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> pieceComposer = new LinkedHashMap<>();
        Map<String, String> pieceKey = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\|");
            String piece = tokens[0];
            String composer = tokens[1];
            String key = tokens[2];

            if (!pieceComposer.containsKey(piece)) {
                pieceComposer.put(piece, composer);
            }
            if (!pieceKey.containsKey(piece)) {
                pieceKey.put(piece, key);
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            String[] tokens = input.split("\\|");
            String command = tokens[0];
            String piece = tokens[1];

            if (command.equals("Add")) {
                String composer = tokens[2];
                String key = tokens[3];

                if (!pieceComposer.containsKey(piece) && !pieceKey.containsKey(piece)) {
                    pieceComposer.put(piece, composer);
                    pieceKey.put(piece, key);
                    System.out.printf("%s by %s in %s added to the collection!%n",
                            piece, composer, key);
                } else {
                    System.out.printf("%s is already in the collection!%n", piece);
                }
            } else if (command.equals("Remove")) {
                if (pieceComposer.containsKey(piece) && pieceKey.containsKey(piece)) {
                    pieceComposer.remove(piece);
                    pieceKey.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",
                            piece);
                }
            } else if (command.equals("ChangeKey")) {
                String newKey = tokens[2];
                if (pieceComposer.containsKey(piece) && pieceKey.containsKey(piece)) {
                    pieceKey.put(piece, newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",
                            piece);
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : pieceComposer.entrySet()) {

            String piece = entry.getKey();
            String composer = entry.getValue();
            String key = pieceKey.get(piece);

            System.out.printf("%s -> Composer: %s, Key: %s%n", piece, composer, key);
        }
    }
}
