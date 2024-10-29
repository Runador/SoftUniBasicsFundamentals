package P_27_10_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> thirdList = new ArrayList<>();

        int thirdListSize = Math.min(firstList.size(), secondList.size());
        int reminder = Math.max(firstList.size(), secondList.size()) - thirdListSize;

        for (int i = 0; i < thirdListSize; i++) {
            thirdList.add(firstList.get(i));
            thirdList.add(secondList.get(i));
        }

        if (firstList.size() > secondList.size()) {
            for (int i = firstList.size() - reminder; i < firstList.size(); i++) {
                thirdList.add(firstList.get(i));
            }
        } else {
            for (int i = secondList.size() - reminder; i < secondList.size(); i++) {
                thirdList.add(secondList.get(i));
            }
        }

        thirdList.forEach(integer -> System.out.print(integer + " "));
    }
}
