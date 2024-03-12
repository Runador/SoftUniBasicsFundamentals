package MoreExerciseLists;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> thirdList = new ArrayList<>();

        Collections.reverse(secondList);

        int minLength = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minLength; i++) {
            int firstElement = firstList.get(i);
            int secondElement = secondList.get(i);
            thirdList.add(firstElement);
            thirdList.add(secondElement);
        }

        List<Integer> sublist;
        if (firstList.size() > secondList.size()) {
            sublist = firstList.subList(firstList.size() - 2, firstList.size());
        } else {
            sublist = secondList.subList(secondList.size() - 2, secondList.size());
        }

        List<Integer> finalList = new ArrayList<>();

        int begin = sublist.get(0);
        int end = sublist.get(1);

        if (begin > end) {
            begin = sublist.get(1);
            end = sublist.get(0);
        }

        for (int i = 0; i < thirdList.size(); i++) {
            if (thirdList.get(i) > begin && thirdList.get(i) < end) {
                finalList.add(thirdList.get(i));
            }
        }

        Collections.sort(finalList);
        System.out.println(finalList.toString().replaceAll("[\\[\\],]", ""));

    }

}
