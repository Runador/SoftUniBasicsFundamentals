package ListsExercises;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> array = Arrays.stream(scanner.nextLine().split("\\|"))
                        .collect(Collectors.toList());

        Collections.reverse(array);

        String output = array.toString().replaceAll("[\\[\\],]", "").trim();
        System.out.println(output.replaceAll("\\s+", " "));
    }
}
