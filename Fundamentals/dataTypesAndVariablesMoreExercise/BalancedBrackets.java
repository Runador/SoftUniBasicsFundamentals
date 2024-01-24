import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        byte openingCount = 0;
        byte closingCount = 0;
        boolean isUnbalanced = false;

        for (byte i = 1; i <= n; i++) {
            char symbol = scanner.nextLine().charAt(0);
            if (symbol == '(') {
                openingCount++;
            } else if (symbol == ')') {
                closingCount++;
                if (openingCount - closingCount != 0) {
                    System.out.println("UNBALANCED");
                    isUnbalanced = true;
                }
            }
        }

        if (openingCount == closingCount) {
            System.out.println("BALANCED");
        } else if (isUnbalanced) {
            System.out.println("UNBALANCED");
        }

    }
}
