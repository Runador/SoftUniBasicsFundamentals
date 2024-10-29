package P_28_10_24;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("Contains")) {
                boolean isContains = false;
                for (Integer integer : integerList) {
                    if (integer == Integer.parseInt(tokens[1])) {
                        isContains = true;
                        break;
                    }
                }
                if (isContains) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (tokens[0].equals("Print")) {
                if (tokens[1].equals("even")) {
                    for (Integer integer : integerList) {
                        if (isEven(integer)) {
                            System.out.print(integer + " ");
                        }
                    }
                    System.out.println();
                } else if (tokens[1].equals("odd")) {
                    for (Integer integer : integerList) {
                        if (!isEven(integer)) {
                            System.out.print(integer + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (tokens[0].equals("Get") && tokens[1].equals("sum")) {
                int sum = 0;
                for (Integer integer : integerList) {
                    sum += integer;
                }
                System.out.println(sum);
            } else if (tokens[0].equals("Filter")) {
                switch (tokens[1]) {
                    case ">":
                        for (Integer integer : integerList) {
                            if (integer > Integer.parseInt(tokens[2])) {
                                System.out.print(integer + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case "<":
                        for (Integer integer : integerList) {
                            if (integer < Integer.parseInt(tokens[2])) {
                                System.out.print(integer + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case ">=":
                        for (Integer integer : integerList) {
                            if (integer >= Integer.parseInt(tokens[2])) {
                                System.out.print(integer + " ");
                            }
                        }
                        System.out.println();
                        break;
                    case "<=":
                        for (Integer integer : integerList) {
                            if (integer <= Integer.parseInt(tokens[2])) {
                                System.out.print(integer + " ");
                            }
                        }
                        System.out.println();
                        break;
                }
            }

            input = scanner.nextLine();
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

