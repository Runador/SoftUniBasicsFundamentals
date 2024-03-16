package Methods.MethodsMoreExercise;

import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 4            1 1 2 4          
        
        int number = Integer.parseInt(scanner.nextLine());

        printTrib(number);
        
    }

    // Recursion Function
    static int printTribRec(int n)
    {
        if (n == 1 || n == 2)
            return 1;

        if (n == 3)
            return 2;
        else
            return printTribRec(n - 1) +
                    printTribRec(n - 2) +
                    printTribRec(n - 3);
    }

    static void printTrib(int n)
    {
        for (int i = 1; i <= n; i++) {
            System.out.print(printTribRec(i) + " ");
        }
    }

}
