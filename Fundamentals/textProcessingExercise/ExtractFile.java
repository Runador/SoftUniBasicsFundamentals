package ExerciseTextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         /*Write a program that reads the path to a file and subtracts the file name and its extension.
         C:\Internal\training-internal\Template.pptx

        output:
        File name: Template
        File extension: pptx*/

        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(input);
        String fileName = "";
        String extension = "";

        for (int i = 0; i < stringBuilder.length(); i++) {

            if (input.contains("\\") && input.contains(".")) {
                int beginIndex = input.lastIndexOf("\\");
                int endIndex = input.indexOf(".");
                fileName = stringBuilder.substring(beginIndex + 1, endIndex);
            }

            if (input.contains(".")) {
                int beginIndex = input.indexOf(".");
                extension = stringBuilder.substring(beginIndex + 1);
            }

        }

        System.out.printf("File name: %s%nFile extension: %s", fileName, extension);
    }
}
