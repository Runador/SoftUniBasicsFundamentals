import java.util.Scanner;

public class workingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday":
                if (hour >= 10 && hour <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            case "Sunday":
                System.out.println("closed");
                break;
        }
    }
}
