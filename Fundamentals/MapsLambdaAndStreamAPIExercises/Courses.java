package Maps.MapsLambdaAndStreamAPIExercises;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> coursesMap = new LinkedHashMap<>();
        Map<String, List<String>> usersMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] tokens = input.split(" : ");
            String course = tokens[0];
            String username = tokens[1];

            if (!coursesMap.containsKey(course)) {
                coursesMap.put(course, 1);
            } else {
                coursesMap.put(course, coursesMap.get(course) + 1);
            }

            if (!usersMap.containsKey(course)) {
                usersMap.put(course, new ArrayList<>());
                usersMap.get(course).add(username);
            } else {
                usersMap.get(course).add(username);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> courseEntry : coursesMap.entrySet()) {
            String course = courseEntry.getKey();
            int counter = courseEntry.getValue();
            List<String> usernames = usersMap.get(course);
            System.out.printf("%s: %d%n", course, counter);
            for (String name : usernames) {
                System.out.printf("-- %s%n", name);
            }
        }
    }
}
