package ProgrammingFundamentalsMidExam03;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int winCounter = 0;
        boolean hasFinishedEnergy = false;

        while (!input.equals("End of battle")) {

            int distance = Integer.parseInt(input);

            if (winCounter % 3 == 0) {
                initialEnergy += winCounter;
            }

            if (initialEnergy >= distance) {
                initialEnergy -= distance;
                winCounter++;
            } else {
                hasFinishedEnergy = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (hasFinishedEnergy) {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", winCounter, initialEnergy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d", winCounter, initialEnergy);
        }
    }
}
