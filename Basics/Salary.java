import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        boolean isFailed = false;

        while (n-- > 0) {
            String site = scanner.nextLine();
            switch (site) {
                case "Facebook" -> salary -= 150;
                case "Instagram" -> salary -= 100;
                case "Reddit" -> salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                isFailed = true;
            }
        }

        if (!isFailed){
            System.out.println(salary);
        }
    }
}
