package ProgrammingFundamentalsMidExam01;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] currentState = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        boolean isFailed = false;

        for (int i = 0; i <= currentState.length - 1; i++) {
            int counts = waitingPeople / 4;
            int reminder = waitingPeople % 4;
            if (counts > 0) {
                if (currentState[i] > 0) {
                    waitingPeople += currentState[i];
                    waitingPeople -= 4;
                    currentState[i] = 4;
                } else {
                    waitingPeople -= 4;
                    currentState[i] = 4;
                }
            } else {
                currentState[i] += reminder;
                waitingPeople = 0;
            }
        }

        for (int element : currentState) {
            if (element < 4) {
                isFailed = true;
                break;
            }
        }

        if (waitingPeople == 0 && !isFailed) {
            System.out.println(Arrays.toString(currentState).replaceAll("[\\[\\],]", ""));
        } else if (!isFailed) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", waitingPeople);
            System.out.println(Arrays.toString(currentState).replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println("The lift has empty spots!");
            System.out.println(Arrays.toString(currentState).replaceAll("[\\[\\],]", ""));
        }

    }
}
