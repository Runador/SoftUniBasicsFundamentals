import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] currentState = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int diffr = peopleWaiting % 4;

        for (int i = 0; i < currentState.length; i++) {

            if (peopleWaiting > 0) {
                if (peopleWaiting < 4) {
                    int reminder = peopleWaiting % 4;
                    currentState[i] += reminder;
                    peopleWaiting -= reminder;
                } else if (currentState[i] == 0){
                    peopleWaiting -= 4;
                    currentState[i] = 4;
                } else {
                    peopleWaiting -= 4;
                    int diff = currentState[i];
                    peopleWaiting += diff;
                    currentState[i] = 4;
                }
            }
        }

        if (peopleWaiting > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
            for (int element : currentState) {
                System.out.print(element + " ");
            }
        } else if (diffr < currentState[currentState.length - 1]){
            for (int element : currentState) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("The lift has empty spots!");
            for (int element : currentState) {
                System.out.print(element + " ");
            }
        }

        // 14
        // 0 2 0 1 3     4 4 4 4 4

        // 14
        // 0 0 0 1 0     4 4 4 3 0

        // System.out.println(Arrays.toString(currentState).replace("[", "").replace("]", "").replace(",", ""));
    }
}
