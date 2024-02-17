package ProgrammingFundamentalsMidExam03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals("End")) {
            int index = Integer.parseInt(input);

            if (index >= 0 && index <= targetsList.size() - 1) {
                int currentTarget = targetsList.get(index);

                if (currentTarget == -1) {
                    continue;
                } else {
                    for (int j = 0; j < targetsList.size(); j++) {
                        if (currentTarget < targetsList.get(j)) {
                            if (targetsList.get(j) != -1) {
                                targetsList.set(j, targetsList.get(j) - currentTarget);
                            }
                        } else {
                            if (targetsList.get(j) != -1) {
                                targetsList.set(j, targetsList.get(j) + currentTarget);
                            }
                        }
                    }

                    targetsList.set(index, -1);
                }
            }

            input = scanner.nextLine();
        }

        for (int element : targetsList) {
            if (element == -1) {
                count++;
            }
        }

        System.out.printf("Shot targets: %d -> ", count);
        System.out.print(targetsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
