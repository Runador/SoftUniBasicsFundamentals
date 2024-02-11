import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int studentsCountPerHour = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;
        int breaks = studentsCount % 4;
        int reminder = studentsCount / studentsCountPerHour;
        int hours = 1;

        if (studentsCountPerHour > reminder) {
            hours++;
        }

        System.out.println("Time needed: " + hours + "h.");
    }
}
