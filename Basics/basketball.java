import java.util.Scanner;

public class basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double sneakers = days - (days * 0.4);
        double outfit = sneakers * 0.8;
        double ball = outfit / 4;
        double accessories = ball / 5;
        double sum = sneakers + outfit + ball + accessories;
        System.out.println(days + sum);

    }
}
