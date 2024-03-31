package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Followers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> likesMap = new LinkedHashMap<>();
        Map<String, Integer> commentsMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Log out")) {

            String[] tokens = input.split(": ");
            String command = tokens[0];
            String username = tokens[1];

            if (command.equals("New follower")) {
                if (!likesMap.containsKey(username)) {
                    likesMap.put(username, 0);
                }
                if (!commentsMap.containsKey(username)) {
                    commentsMap.put(username, 0);
                }
            } else if (command.equals("Like")) {
                int count = Integer.parseInt(tokens[2]);

                if (!likesMap.containsKey(username)) {
                    likesMap.put(username, count);
                } else {
                    likesMap.put(username, likesMap.get(username) + count);
                }
            } else if (command.equals("Comment")) {

                if (!commentsMap.containsKey(username)) {
                    commentsMap.put(username, 1);
                } else {
                    commentsMap.put(username, commentsMap.get(username) + 1);
                }
            } else if (command.equals("Blocked")) {

                if (!likesMap.containsKey(username) && !commentsMap.containsKey(username)) {
                    System.out.printf("%s doesn't exist.%n", username);
                } else {
                    likesMap.remove(username);
                    commentsMap.remove(username);
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("%d followers%n", likesMap.size());

        for (Map.Entry<String, Integer> followersEntry : likesMap.entrySet()) {

            String username = followersEntry.getKey();
            int countLikes;

            if (followersEntry.getValue() == null) {
                countLikes = 0;
            } else {
                countLikes = followersEntry.getValue();
            }

            int countComments;

            if (commentsMap.get(username) == null) {
                countComments = 0;
            } else {
                countComments = commentsMap.get(username);
            }

            System.out.printf("%s: %d%n", username, countLikes + countComments);
        }
    }
}
