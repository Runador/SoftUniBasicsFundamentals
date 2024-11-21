import java.util.Scanner;

public class Greening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double metres = Double.parseDouble(scanner.nextLine());
        double finalPrice = metres * 7.61 * 0.82;
        System.out.printf("The final price is: %.2f lv.\n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", metres * 7.61 * 0.18);
    }
}
