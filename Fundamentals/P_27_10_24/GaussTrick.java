package P_27_10_24;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int size = integerList.size();

        for (int i = 0; i < size / 2; i++) {
            int first = integerList.get(i);
            integerList.set(i, first + integerList.get(integerList.size() - 1));
            integerList.remove(integerList.size() - 1);
        }

        integerList.forEach(integer -> System.out.print(integer + " "));
    }
}
