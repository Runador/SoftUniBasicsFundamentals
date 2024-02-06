import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfField = Integer.parseInt(scanner.nextLine());
        int[] field = new int[sizeOfField];
        int[] initialIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < initialIndexes.length; i++) {
            int index = initialIndexes[i];
            if (index >= 0 && index < field.length) {
                field[index] = 1; // инициализираме индексите във field[] с 1
            }
        }

        /*for (int index : initialIndexes) {
            field[index] = 1; // инициализираме индексите във field[] с 1
        }*/

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            int index = Integer.parseInt(command.split(" ")[0]);
            String direction = command.split(" ")[1];
            int flyLength = Integer.parseInt(command.split(" ")[2]);

            // 0 right 1
            // ако се мести с 1 надясно и няма друга калинка, тогава спира на индекс flyLength
            // ако се мести с 1 надясно и има друга калинка, тогава продължава да се мести с flyLength
            // 1 1 0 - field[]
            // 0 1 1 - field after "0 right 1"      0 = index; 1 = flyLength
            // 0 1 0 - field after "2 right 1"      2 = index; 1 = flyLength
            // има летене ако: индексът е в границите на масива и индексът има калинка
            if (index >= 0 && index <= field.length - 1 && field[index] == 1) {
                // калинката излетява
                field[index] = 0; // нямаме вече калинка тук

                if (direction.equals("left")) {
                    index -= flyLength; // мести се надясно на индекса flyLength

                    while (index >= 0 && field[index] == 1) {
                        index -= flyLength; // ако е зает индекса тогава продължава да лети
                    }
                    if (index >= 0) {
                        field[index] = 1; // вече не е зает индекса тогава каца
                    }

                } else if (direction.equals("right")) {
                    index += flyLength; // мести се надясно на индекса flyLength

                    while (index <= field.length - 1 && field[index] == 1) {
                        index += flyLength; // ако е зает индекса тогава продължава да лети
                    }
                    if (index <= field.length - 1) {
                        field[index] = 1; // вече не е зает индекса тогава каца
                    }
                }
            }

            command = scanner.nextLine();
        }

        System.out.println(Arrays.toString(field).replace("[", "").replace("]", "")
                .replace(", ", " "));
    }
}
