package Maps.MapsLambdaAndStreamAPIExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> studentsGrades = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrades.containsKey(name)) {
                studentsGrades.put(name, grade);
            } else {
                studentsGrades.put(name, (studentsGrades.get(name) + grade) / 2);
            }

        }

        for (Map.Entry<String, Double> studentsGradesMap : studentsGrades.entrySet()) {
            if (studentsGradesMap.getValue() >= 4.50) {
                System.out.printf("%s -> %.2f%n", studentsGradesMap.getKey(),
                        studentsGradesMap.getValue());
            }
        }
    }

}
