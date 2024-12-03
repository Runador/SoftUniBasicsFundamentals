import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        if (projection.equals("Premiere")) {
            System.out.printf("%.2f leva", 12.0 * rows * cols);
        } else if (projection.equals("Normal")) {
            System.out.printf("%.2f leva", 7.5 * rows * cols);
        } else if (projection.equals("Discount")) {
            System.out.printf("%.2f leva", 5.0 * rows * cols);
        }
    }
}
