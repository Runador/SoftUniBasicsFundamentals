package P_28_10_24;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < integerList.size(); i++) {
            int el = integerList.get(i);
            if (el < 0) {
                integerList.remove(Integer.valueOf(el));
                i--;
            }
        }

        Collections.reverse(integerList);

        if (integerList.size() != 0) {
            for (int i : integerList) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("empty");
        }
    }
}
