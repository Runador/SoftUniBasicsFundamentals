import java.util.Scanner;

public class RecursiveFibonacci {
    private static long[] cache;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        cache = new long[n + 1];

        System.out.println(getFibonacci(n));
    }

    private static long getFibonacci(int n) {
        if (n < 2) {
            return n;
        }
        if (cache[n] != 0) {
            return cache[n];
        }

        long number = (getFibonacci(n - 1) + getFibonacci(n - 2));
        cache[n] = number;

        return number;
    }
}
