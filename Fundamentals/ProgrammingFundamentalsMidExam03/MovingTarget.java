package ProgrammingFundamentalsMidExam03;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        // 9.25
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commands = input.split(" ");
            String command = commands[0];
            int index = Integer.parseInt(commands[1]);

            switch (command) {
                case "Shoot":
                    // Shoot 5 10
                    int power = Integer.parseInt(commands[2]);
                    if (index >= 0 && index <= targetsList.size() - 1) {
                        int element = targetsList.get(index);
                        if (element > 0) {
                            targetsList.set(index, element -= power);
                            if (element <= 0) {
                                targetsList.remove(index);
                            }
                        }
                    }
                    break;
                case "Add":
                    // Add 22 3
                    int value = Integer.parseInt(commands[2]);
                    if (index >= 0 && index <= targetsList.size() - 1) {
                        targetsList.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    // 52 74 23 44 96 110
                    // 0 1
                    int radius = Integer.parseInt(commands[2]);

                    if (index - radius >= 0 && index + radius < targetsList.size() - 1) {
                        targetsList.subList(index - radius, index + radius + 1).clear();
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        String output = targetsList.toString().replaceAll("[\\[\\],]", "");
        System.out.println(output.replaceAll(" ", "|"));
    }
}
