import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestPercentPerYear = Double.parseDouble(scanner.nextLine());
        double sum = depositSum + months * ((depositSum * (interestPercentPerYear / 100)) / 12);
        // депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        System.out.println(sum);
    }
}
