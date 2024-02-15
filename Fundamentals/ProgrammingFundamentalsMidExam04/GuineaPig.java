package ProgrammingFundamentalsMidExam04;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodQuantityInKilo = Double.parseDouble(scanner.nextLine());
        double hayQuantityInKilo = Double.parseDouble(scanner.nextLine());
        double coverQuantityInKilo = Double.parseDouble(scanner.nextLine());
        double weightInKilo = Double.parseDouble(scanner.nextLine());

        double foodQuantityInGrams = foodQuantityInKilo * 1000;
        double hayQuantityInGrams = hayQuantityInKilo * 1000;
        double coverQuantityInGrams = coverQuantityInKilo * 1000;
        double weightInGrams = weightInKilo * 1000;

        for (int i = 1; i <= 30; i++) {
            if (foodQuantityInGrams > 0 && hayQuantityInGrams > 0 && coverQuantityInGrams > 0) {
                foodQuantityInGrams -= 300;
                if (i % 2 == 0) {
                    foodQuantityInGrams -= 300;
                    double fivePercentHay = foodQuantityInGrams * 0.05;
                    hayQuantityInGrams -= fivePercentHay;
                }
                if (i % 3 == 0) {
                    double oneThirthCover = weightInGrams / 3;
                    coverQuantityInGrams -= oneThirthCover;
                }
            } else {
                break;
            }
        }

        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                foodQuantityInGrams / 1000, hayQuantityInGrams / 1000, coverQuantityInGrams / 1000);
    }
}
