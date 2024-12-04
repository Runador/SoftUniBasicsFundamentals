import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfGroups = Integer.parseInt(scanner.nextLine());

        double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        while (amountOfGroups-- > 0) {
            int amountOfPeople = Integer.parseInt(scanner.nextLine());

            if (amountOfPeople <= 5) {
                p1+=amountOfPeople;
            } else if (amountOfPeople <= 12) {
                p2+=amountOfPeople;
            } else if (amountOfPeople <= 25) {
                p3+=amountOfPeople;
            } else if (amountOfPeople <= 40) {
                p4+=amountOfPeople;
            } else {
                p5+=amountOfPeople;
            }
        }

        double s = 100.0 / (p1 + p2 + p3 + p4 + p5);

        System.out.printf("%.2f%%%n", s * p1);
        System.out.printf("%.2f%%%n", s * p2);
        System.out.printf("%.2f%%%n", s * p3);
        System.out.printf("%.2f%%%n", s * p4);
        System.out.printf("%.2f%%%n", s * p5);
    }
}
