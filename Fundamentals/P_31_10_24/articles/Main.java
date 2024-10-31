package P_31_10_24.articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleTokens = scanner.nextLine().split(", ");
        Article article = new Article(articleTokens[0], articleTokens[1], articleTokens[2]);
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split(": ");
            if (tokens[0].equals("Edit")) {
                article.edit(tokens[1]);
            } else if (tokens[0].equals("ChangeAuthor")) {
                article.changeAuthor(tokens[1]);
            } else if (tokens[0].equals("Rename")) {
                article.rename(tokens[1]);
            }
        }

        System.out.println(article);
    }
}
