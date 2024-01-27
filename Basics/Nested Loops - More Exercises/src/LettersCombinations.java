import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char begin = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        char skippedSymbol = scanner.nextLine().charAt(0);
        int counter = 0;

        for (char first = begin; first <= end; first++) {
            for (char second = begin; second <= end; second++) {
                for (char third = begin; third <= end; third++) {
                    if (first == skippedSymbol || second == skippedSymbol || third == skippedSymbol) {
                        continue;
                    } else {
                        System.out.printf("%c%c%c ", first, second, third);
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);
    }
}