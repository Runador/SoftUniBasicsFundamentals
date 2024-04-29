package textProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        // A12b s17G
        double totalSum = 0;

        for (int i = 0; i < input.length; i++) {
            String element = input[i];
            char firstSymbol = element.charAt(0);
            char lastSymbol = element.charAt(element.length() - 1);
            String numberAsString = "";
            for (int j = 0; j < element.length(); j++) {
                char symbol = element.charAt(j);
                if (Character.isDigit(symbol)) {
                    numberAsString += symbol;
                }
            }
            double number = Double.parseDouble(numberAsString);
            int firstPosition = letterPositionInAlphabet(String.valueOf(firstSymbol));
            if (Character.isUpperCase(firstSymbol)) {
                number /= firstPosition;
            } else {
                number *= firstPosition;
            }
            int lastPosition = letterPositionInAlphabet(String.valueOf(lastSymbol));
            if (Character.isUpperCase(lastSymbol)) {
                number -= lastPosition;
            } else {
                number += lastPosition;
            }
            totalSum += number;
        }

        System.out.printf("%.2f", totalSum);
    }

    public static int letterPositionInAlphabet(String letter) {
        String[] alphabet = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z".split(",");
        int position = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (letter.toLowerCase().equals(alphabet[i])) {
                position = i + 1;
                break;
            }
        }
        return position;
    }

}
