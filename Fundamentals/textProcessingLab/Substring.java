package TextProcessingLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        for (int i = 0; i < secondString.length(); i++) {

            if (secondString.contains(firstString)) {
                secondString = secondString.replace(firstString, "");
            }
        }

        System.out.println(secondString);
    }
}
