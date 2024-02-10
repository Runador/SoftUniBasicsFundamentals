package ListsLab;

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

        int minimalSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minimalSize; i++) {
            int firstElement = firstList.get(i);
            int secondElement = secondList.get(i);
            thirdList.add(firstElement);
            thirdList.add(secondElement);
        }

        if (firstList.size() > secondList.size()) {
            thirdList.addAll(firstList.subList(minimalSize, firstList.size()));
        } else {
            thirdList.addAll(secondList.subList(minimalSize, secondList.size()));
        }

        System.out.println(thirdList.toString().replaceAll("[\\[\\],]", ""));
    }
}

