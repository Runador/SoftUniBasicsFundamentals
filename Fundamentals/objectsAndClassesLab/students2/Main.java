package ObjectsAndClassesLab.students2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String hometown = tokens[3];

            Student student = new Student(firstName, lastName, age, hometown);
            studentList.add(student);

            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        // If you receive a student who already exists (first name and last name should be unique),
        // overwrite the information.

        for (Student student : studentList) {

            if (isStudentExists(studentList, student.getFirstName(), student.getLastName())) {
                Student student1 = getStudent(studentList, student.getFirstName(), student.getLastName());

                student1.setFirstName(student1.getFirstName());
                student1.setLastName(student1.getLastName());
                student1.setAge(student1.getAge());
                student1.setHometown(city);
            } else {
                Student student1 = new Student(student.getFirstName(), student.getLastName(), student.getAge(), student.getHometown());
                studentList.add(student1);
            }

        }

        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    private static boolean isStudentExists(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent (List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;

    }

}
