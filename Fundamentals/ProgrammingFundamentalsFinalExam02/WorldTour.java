package ProgrammingFundamentalsFinalExam02;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialStops = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(initialStops);

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {

            String[] tokens = input.split(":");
            String command = tokens[0];

            if (command.equals("Add Stop")) {
                int index = Integer.parseInt(tokens[1]);
                String newStop = tokens[2];
                if (index >= 0 && index <= stopsBuilder.length() - 1) {
                    stopsBuilder.insert(index, newStop);
                }
                System.out.println(stopsBuilder);
            } else if (command.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);
                if (startIndex >= 0 && endIndex <= stopsBuilder.length() - 1) {
                    stopsBuilder.delete(startIndex, endIndex + 1);
                }
                System.out.println(stopsBuilder);
            } else if (command.equals("Switch")) {
                //Switch:{old_string}:{new_string}":
                //If the old string is in the initial string, replace it with the new one (all occurrences).
                String oldString = tokens[1];
                String newString = tokens[2];
                if (stopsBuilder.toString().contains(oldString)) {
                    String output = stopsBuilder.toString().replace(oldString, newString);
                    stopsBuilder = new StringBuilder(output);
                }
                System.out.println(stopsBuilder);
            }

            input = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + stopsBuilder);
    }
}

