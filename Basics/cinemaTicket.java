import java.util.Scanner;

public class cinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        switch (day) {
            case "Monday" -> System.out.println(12);
            case "Tuesday" -> System.out.println(12);
            case "Wednesday" -> System.out.println(14);
            case "Thursday" -> System.out.println(14);
            case "Friday" -> System.out.println(12);
            case "Saturday" -> System.out.println(16);
            case "Sunday" -> System.out.println(16);
        }
    }
}
