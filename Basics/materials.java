import java.util.Scanner;

public class materials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int preparation = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double sum = (pens * 5.8) + (markers * 7.2) + (preparation * 1.2);
        System.out.println(sum);
        double result = sum -= sum * percent / 100;

        System.out.println(result);
    }
}
