import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfPeople = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double sum;
        double finalSum = 0;
        int counter = 0;

        while (!input.equals("Finish")) {
            sum = 0;
            counter++;
            String presentationName = input;
            for (int i = 0; i < amountOfPeople; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sum += grade;
            }
            System.out.printf("%s - %.2f.%n", presentationName, sum / amountOfPeople);
            finalSum += sum / amountOfPeople;
            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", finalSum / counter);
    }
}
