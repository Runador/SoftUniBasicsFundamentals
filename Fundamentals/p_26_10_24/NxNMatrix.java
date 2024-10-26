package p_26_10_24;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMatrix(Integer.parseInt(scanner.nextLine()));
    }

    private static void printMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
