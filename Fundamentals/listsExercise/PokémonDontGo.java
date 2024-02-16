import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class pokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distances = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sumRemoved = 0;

        while (distances.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= distances.size() - 1) {
                int removedElement = distances.get(index);
                sumRemoved += removedElement;
                distances.remove(index);
                modifyList(distances, removedElement);
            } else if (index < 0) {
                int removedElement = distances.get(0);
                sumRemoved += removedElement;
                int lastElement = distances.get(distances.size() - 1);
                distances.set(0, lastElement);
                modifyList(distances, removedElement);
            } else if (index > distances.size() - 1) {
                int removedElement = distances.get(distances.size() - 1);
                sumRemoved += removedElement;
                int firstElement = distances.get(0);
                distances.set(distances.size() - 1, firstElement);
                modifyList(distances, removedElement);
            }
        }

        System.out.println(sumRemoved);
    }

    private static void modifyList(List<Integer> integerList, int removedElement) {
        for (int j = 0; j < integerList.size(); j++) {
            int element = integerList.get(j);
            if (element <= removedElement) {
                integerList.set(j, Math.abs(removedElement + integerList.get(j)));
            } else {
                integerList.set(j, Math.abs(removedElement - integerList.get(j)));
            }
        }
    }
}
