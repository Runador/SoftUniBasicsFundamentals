package ProgrammingFundamentalsMidExam05;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double totalBonus = 0.0;
        double max = 0.0;
        int studentsAttendances = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int countOfAttendances = Integer.parseInt(scanner.nextLine());
            totalBonus = (countOfAttendances * 1.0 / numberOfLectures) * (5 + additionalBonus);
            if (totalBonus > max) {
                max = totalBonus;
                studentsAttendances = countOfAttendances;
            }
        }

        System.out.printf("Max Bonus: %.0f.\n", Math.ceil(max));
        System.out.printf("The student has attended %d lectures.", studentsAttendances);

    }
}
