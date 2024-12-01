import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int veganMenus = Integer.parseInt(scanner.nextLine());

        double sum = (chickenMenus * 10.35) + (fishMenus * 12.4) + (veganMenus * 8.15);
        double desert = sum * 0.2;
        System.out.println(sum + desert + 2.5);
    }
}
