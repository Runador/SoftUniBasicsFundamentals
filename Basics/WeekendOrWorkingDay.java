import java.util.Scanner;

public class WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday":
                System.out.println("Working day"); break;
            case "Saturday", "Sunday":
                System.out.println("Weekend"); break;
            default:
                System.out.println("Error");
        }
    }
}
