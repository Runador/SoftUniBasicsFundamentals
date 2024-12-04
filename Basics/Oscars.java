import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double judgePoints = 0;
        double finalJudgePoints = academyPoints;
        boolean isNotFailed = false;

        while (n-- > 0) {
            String judgeName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            judgePoints = judgeName.length() * points / 2;
            finalJudgePoints += judgePoints;

            if (finalJudgePoints >= 1250.5) {
                System.out.printf("Congratulations, " +
                        "%s got a nominee for leading role with %.1f!",
                        name, finalJudgePoints);
                isNotFailed = true;
                break;
            }
        }

        if (!isNotFailed) {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - finalJudgePoints);
        }
    }
}
