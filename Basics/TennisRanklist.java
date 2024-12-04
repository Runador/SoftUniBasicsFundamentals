import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsAmount = Integer.parseInt(scanner.nextLine());
        int beginPoints = Integer.parseInt(scanner.nextLine());
        int sumPoints = beginPoints;
        int wCounter = 0;

        for (int i = 0; i < tournamentsAmount; i++) {
            String tournamentPosition = scanner.nextLine();
            if (tournamentPosition.equals("W")) {
                sumPoints += 2000;
                wCounter++;
            } else if (tournamentPosition.equals("F")) {
                sumPoints += 1200;
            } else if (tournamentPosition.equals("SF")) {
                sumPoints += 720;
            }
        }

        double percent = 100.0 / tournamentsAmount;

        System.out.println("Final points: " + sumPoints);
        System.out.println("Average points: " + ((sumPoints - beginPoints ) / tournamentsAmount));
        System.out.printf("%.2f%%", percent * wCounter);
    }
}

