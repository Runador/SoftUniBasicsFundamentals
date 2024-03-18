package TextProcessing.MoreExercisesStringsAndTextProcessing;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] morseCode = scanner.nextLine().split("[| ]");

        String output = "";

        for (int i = 0; i < morseCode.length; i++) {
            String word = morseCode[i];
            if (word.equals("")) {
                word = " ";
            }
            String letter = getLetterInMorseCode(word);
            output += letter;
        }

        output = output.replaceAll("\\s{2,}", " ");
        System.out.println(output);
    }

    private static String getLetterInMorseCode(String word) {
        String letter = word;
        if (word.equals(".-")) {
            letter = "A";
        } else if (word.equals("-...")) {
            letter = "B";
        } else if (word.equals("-.-.")) {
            letter = "C";
        } else if (word.equals("-..")) {
            letter = "D";
        } else if (word.equals(".")) {
            letter = "E";
        } else if (word.equals("..-.")) {
            letter = "F";
        } else if (word.equals("--.")) {
            letter = "G";
        } else if (word.equals("....")) {
            letter = "H";
        } else if (word.equals("..")) {
            letter = "I";
        } else if (word.equals(".---")) {
            letter = "J";
        } else if (word.equals("-.-")) {
            letter = "K";
        } else if (word.equals(".-..")) {
            letter = "L";
        } else if (word.equals("--")) {
            letter = "M";
        } else if (word.equals("-.")) {
            letter = "N";
        } else if (word.equals("---")) {
            letter = "O";
        } else if (word.equals(".--.")) {
            letter = "P";
        } else if (word.equals("--.-")) {
            letter = "Q";
        } else if (word.equals(".-.")) {
            letter = "R";
        } else if (word.equals("...")) {
            letter = "S";
        } else if (word.equals("-")) {
            letter = "T";
        } else if (word.equals("..-")) {
            letter = "U";
        } else if (word.equals("...-")) {
            letter = "V";
        } else if (word.equals(".--")) {
            letter = "W";
        } else if (word.equals("-..-")) {
            letter = "X";
        } else if (word.equals("-.--")) {
            letter = "Y";
        } else if (word.equals("--..")) {
            letter = "Z";
        }
        return letter;
}

}
