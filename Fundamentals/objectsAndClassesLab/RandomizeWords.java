package ObjectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .collect(Collectors.toList());

        for (int i = 0; i < stringList.size(); i++) {
            Random random = new Random();
            int randomItem = random.nextInt(stringList.size());
            String element = stringList.get(randomItem);
            System.out.println(element);
        }

    }
}
