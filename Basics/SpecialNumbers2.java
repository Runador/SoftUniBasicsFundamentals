import P_31_10_24.person.Person;

import java.util.Scanner;

public class SpecialNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isSpecial = false;

        for (int i = 1111; i <= 9999; i++) {
            int number = i;
            while (number > 0) {
                int reminder = number % 10;
                if (n % reminder == 0) {
                    isSpecial = true;
                } else {
                    isSpecial = false;
                    break;
                }
                number /= 10;
            }

            if (isSpecial) {
                System.out.print(i + " ");
            }
        }
    }
}
