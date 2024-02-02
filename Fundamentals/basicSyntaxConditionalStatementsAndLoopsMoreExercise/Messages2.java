import java.util.Scanner;

public class Messages2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(scanner.nextLine());
            String numberAsString = String.valueOf(number);
            int inputLength = numberAsString.length();
            int mainDigit = number % 10;
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }

            int letterIndex = (offset + inputLength - 1);

            if (number == 0) {
                System.out.print(" ");
            } else {
                System.out.print((char) (letterIndex + 97));
            }
        }
    }
}
