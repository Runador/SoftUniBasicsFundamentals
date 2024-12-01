import java.util.Scanner;

public class repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int dye = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double tenPercentDye = dye * 0.1;
        double sum = ((nylon + 2) * 1.5) + ((dye + tenPercentDye) * 14.5) + (thinner * 5.0) + 0.4;
        double mastersSum = sum * 0.3 * hours;
        System.out.println(sum + mastersSum);
    }
}
