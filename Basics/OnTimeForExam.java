import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int sumExamMinutes = examHour * 60 + examMinutes;
        int sumArrivalMinutes = arrivalHour * 60 + arrivalMinutes;
        int difference = Math.abs(sumExamMinutes - sumArrivalMinutes);
        int hours = difference / 60;
        int minutes = difference % 60;

        if (sumArrivalMinutes > sumExamMinutes) {
            System.out.println("Late");
            printHoursAndMinutesMessageLate(hours, minutes);
        } else if ((sumExamMinutes - sumArrivalMinutes) > 30) {
            System.out.println("Early");
            printHoursAndMinutesMessageEarly(hours, minutes);
        } else if ((sumExamMinutes - sumArrivalMinutes) <= 30) {
            System.out.println("On time");
            if (difference != 0) {
                printHoursAndMinutesMessageEarly(hours, minutes);
            }
        }
    }

    private static void printHoursAndMinutesMessageEarly(int hours, int minutes) {
        if (hours <= 0) {
            System.out.printf("%d minutes before the start", minutes);
        } else {
            if (minutes < 10) {
                System.out.printf("%d:0%d hours before the start", hours, minutes);
            } else {
                System.out.printf("%d:%d hours before the start", hours, minutes);
            }
        }
    }

    private static void printHoursAndMinutesMessageLate(int hours, int minutes) {
        if (hours <= 0) {
            System.out.printf("%d minutes after the start", minutes);
        } else {
            if (minutes < 10) {
                System.out.printf("%d:0%d hours after the start", hours, minutes);
            } else {
                System.out.printf("%d:%d hours after the start", hours, minutes);
            }
        }
    }
}



