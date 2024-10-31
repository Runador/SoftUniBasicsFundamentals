package P_31_10_24.students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Student student = new Student(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
            studentList.add(student);
        }

        studentList.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(studentList);
        studentList.forEach(System.out::println);
    }
}
