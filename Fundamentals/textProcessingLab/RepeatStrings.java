package TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String output = "";

        for (int i = 0; i < input.length; i++) {
            int stringLength = input[i].length();
            for (int j = 0; j < stringLength; j++) {
                output += input[i];
            }
        }

        System.out.println(output);
    }

}
