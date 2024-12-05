import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());
        int poorCounter = 1;
        int counter = 0;
        String input = scanner.nextLine();
        double sum = 0;
        boolean isFailed = false;
        String taskName = "";

        while (!input.equals("Enough")) {
            if (poorCounter == poorGrades) {
                System.out.printf("You need a break, %d poor grades.", poorGrades);
                isFailed = true;
                break;
            }
            taskName = input;
            double grade = Double.parseDouble(scanner.nextLine());
            sum += grade;
            if (grade <= 4) {
                poorCounter++;
            }
            counter++;
            input = scanner.nextLine();
        }
        if (!isFailed) {
            System.out.printf("Average score: %.2f%n", sum / counter);
            System.out.printf("Number of problems: %d%n", counter);
            System.out.printf("Last problem: %s", taskName);
        }
    }
}
