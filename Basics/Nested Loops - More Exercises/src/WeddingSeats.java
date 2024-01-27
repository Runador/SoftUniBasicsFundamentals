import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int rowsInFirstSector = Integer.parseInt(scanner.nextLine());
        int oddPlaces = Integer.parseInt(scanner.nextLine());
        int evenPlaces = oddPlaces + 2;
        char a;
        int countPlaces = 0;

        for (char A = 'A'; A <= lastSector; A++) {
            for (int row = 1; row <= rowsInFirstSector; row++) {
                a = 'a';
                if (row % 2 == 0) {
                    for (int i = 0; i < evenPlaces; i++) {
                        countPlaces++;
                        System.out.printf("%c%d%c%n", A, row, a);
                        a++;
                    }
                } else {
                    for (int i = 0; i < oddPlaces; i++) {
                        countPlaces++;
                        System.out.printf("%c%d%c%n", A, row, a);
                        a++;
                    }
                }
            }
            rowsInFirstSector++;
        }

        System.out.println(countPlaces);
    }
}
