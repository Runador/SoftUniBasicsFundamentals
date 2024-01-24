import java.util.Arrays;
import java.util.Scanner;

public class Train2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] train = new int[n];
        int sum = 0;

        for (int wagon = 0; wagon < n; wagon++) {
            int people = Integer.parseInt(scanner.nextLine());
            sum += people;
            train[wagon] = people;
        }

        for (int i = 0; i < train.length; i++) {
            System.out.print(train[i] + " ");
        }

        System.out.println("\n" + sum);
    }
}
