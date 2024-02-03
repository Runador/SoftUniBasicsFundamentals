import java.util.Scanner;

public class RecursiveFibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = Long.parseLong(scanner.nextLine());
        System.out.println(getFibonacci(number));
    }

    private static long getFibonacci(long number) {
        if (number < 2) {
            return number;
        } else {
            return getFibonacci(number - 1) + getFibonacci( number - 2);
        }
    }
}
