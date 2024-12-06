import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 0;

        String input = scanner.nextLine();

        while (true) {
            if (input.equals("Going home")) {
                int goingHomeSteps = Integer.parseInt(scanner.nextLine());
                goal += goingHomeSteps;
                if (goal >= 10000) {
                    System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Math.abs(10000 - goal));
                    break;
                } else {
                    System.out.printf("%d more steps to reach goal.", Math.abs(10000 - goal));
                    break;
                }
            } else {
                int steps = Integer.parseInt(input);
                goal += steps;
                if (goal >= 10000) {
                    System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Math.abs(10000 - goal));
                    break;
                }
            }

            input = scanner.nextLine();
        }


    }
}

