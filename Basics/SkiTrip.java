import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String grade = scanner.nextLine();
        double sum = 0;

        if (type.equals("room for one person")) {
            sum = 18 * (days - 1);
        } else if (type.equals("apartment")) {
            sum = 25 * (days - 1);
            if (days < 10) {
                sum -= sum * 0.3;
            } else if (days <= 15) {
                sum -= sum * 0.35;
            } else {
                sum -= sum * 0.5;
            }
        } else if (type.equals("president apartment")) {
            sum = 35 * (days - 1);
            if (days < 10) {
                sum -= sum * 0.1;
            } else if (days <= 15) {
                sum -= sum * 0.15;
            } else {
                sum -= sum * 0.2;
            }
        }

        if (grade.equals("positive")) {
            sum += sum * 0.25;
        } else {
            sum -= sum * 0.1;
        }

        System.out.printf("%.2f", sum);
    }
}
