package TextProcessing.MoreExercisesStringsAndTextProcessing;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String H1 = scanner.nextLine();
        String article = scanner.nextLine();
        String input = scanner.nextLine();

        System.out.printf("<h1>%n\t%s%n</h1>%n", H1);
        System.out.printf("<article>%n\t%s%n</article>%n", article);

        while (!input.equals("end of comments")) {

            String comment = input;
            System.out.printf("<div>%n\t%s%n</div>%n", comment);

            input = scanner.nextLine();
        }

    }

}
