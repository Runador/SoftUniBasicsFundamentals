import java.util.Scanner;

public class bonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double bonus = 0;

        if (number <= 100) {
            bonus += 5;
        } else if (number <= 1000) {
            bonus += number * 0.2;
        } else {
            bonus += number * 0.1;
        }

        if (number % 2 == 0) {
            bonus += 1;
        } else if (number % 5 == 0) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}
