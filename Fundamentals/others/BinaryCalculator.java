import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinaryCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<Integer> integerList = new ArrayList<>();

        while (num > 0) {
            int reminder = num % 2;
            integerList.add(reminder);
            num /= 2;
        }

        Collections.reverse(integerList);
        integerList.forEach(numb -> System.out.printf("%d", numb));

    }
}
