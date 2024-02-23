package ObjectsAndClassesExercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(": ");
            String command = tokens[0];

            if (command.equals("Edit")) {
                String newContent = tokens[1];
                article.Edit(newContent);
            } else if (command.equals("ChangeAuthor")) {
                String newAuthor = tokens[1];
                article.changeAuthor(newAuthor);
            } else if (command.equals("Rename")) {
                String newTitle = tokens[1];
                article.rename(newTitle);
            }
        }

        System.out.println(article);
    }
}
