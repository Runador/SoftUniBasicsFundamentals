import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String input = scanner.nextLine();

        int classCounter = 0;
        int failsCounter = 0;
        double gradesSum = 0;
        boolean isFailed = false;

        while (true) {
            double grade = Double.parseDouble(input);
            classCounter++;
            if (grade >= 4) {
                gradesSum += grade;
            } else {
                failsCounter++;
            }
            if (failsCounter > 1) {
                System.out.printf("%s has been excluded at %d grade", name, classCounter - 1);
                isFailed = true;
                break;
            }
            if (classCounter == 12) {
                break;
            }
            input = scanner.nextLine();
        }

        if (!isFailed) {
            System.out.printf("%s graduated. Average grade: %.2f", name, gradesSum / 12);
        }
    }
}
