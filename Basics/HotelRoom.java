import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double sumStudio = 0;
        double sumApartment = 0;

        switch (month) {
            case "May", "October" -> {
                sumStudio = 50 * nights;
                sumApartment = 65 * nights;
                if (nights > 7 && nights <= 14) {
                    sumStudio = sumStudio * 0.95;
                } else if (nights > 14) {
                    sumStudio = sumStudio * 0.70;
                    sumApartment = sumApartment * 0.9;
                }
            }
            case "June", "September" -> {
                sumStudio = 75.2 * nights;
                sumApartment = 68.7 * nights;
                if (nights > 14) {
                    sumStudio = sumStudio * 0.80;
                    sumApartment = sumApartment * 0.9;
                }
            }
            case "July", "August" -> {
                sumStudio = 76 * nights;
                sumApartment = 77 * nights;
                if (nights > 14) {
                    sumApartment = sumApartment * 0.9;
                }
            }
        }

        System.out.printf("Apartment: %.2f lv.%n", sumApartment);
        System.out.printf("Studio: %.2f lv.", sumStudio);
    }
}
