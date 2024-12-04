import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        while (n-- > 0) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1++;
            } else if (number <= 399) {
                p2++;
            } else if (number <= 599) {
                p3++;
            } else if (number <= 799) {
                p4++;
            } else {
                p5++;
            }
        }

        double s = 100.0 / (p1 + p2 + p3 + p4 + p5);

        System.out.printf("%.2f%%%n", p1 * s);
        System.out.printf("%.2f%%%n", p2 * s);
        System.out.printf("%.2f%%%n", p3 * s);
        System.out.printf("%.2f%%%n", p4 * s);
        System.out.printf("%.2f%%%n", p5 * s);
    }
}
