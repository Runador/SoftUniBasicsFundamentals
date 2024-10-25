package P_25_10_24;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] namesAsNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int result = getEncryption(name);
            namesAsNumbers[i] = result;
        }

        Arrays.sort(namesAsNumbers);
        for (int number : namesAsNumbers) {
            System.out.println(number);
        }
    }

    private static int getEncryption(String name) {
        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            char sym = name.charAt(i);
            if (       sym == 'a' || sym == 'A'
                    || sym == 'e' || sym == 'E'
                    || sym == 'i' || sym == 'I'
                    || sym == 'o' || sym == 'O'
                    || sym == 'u' || sym == 'U' ) {
                        sym *= name.length();
            } else {
                        sym /= name.length();
            }
            sum += sym;
        }

        return sum;
    }
}
