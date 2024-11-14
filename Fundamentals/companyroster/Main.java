package P_14_11_24.companyroster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String email = "n/a";
            int age = -1;
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];
            if (tokens.length == 5) {
                if (Character.isDigit(tokens[4].charAt(0))) {
                    age = Integer.parseInt(tokens[4]);
                } else {
                    email = tokens[4];
                }
            } else if (tokens.length == 6) {
                email = tokens[4];
                age = Integer.parseInt(tokens[5]);
            }
            Employee employee = new Employee(name, salary, position, department, email, age);
            employees.add(employee);
        }
        employees.forEach(System.out::println);

        double sum = 0;
        double max = Double.MIN_VALUE;

        for (Employee e : employees) {
            sum += e.getSalary();
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(sum);
    }
}
