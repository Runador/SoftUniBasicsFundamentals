import java.util.Scanner;

public class worldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeFor1MeterInSeconds = Double.parseDouble(scanner.nextLine());
        double delayTime = Math.floor(distance / 15);
        double allTime = distance * timeFor1MeterInSeconds + delayTime * 12.5;
        double remaining = Math.abs(record - allTime);
        if (allTime <= record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",
                    allTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",
                    remaining);
        }
    }

}
