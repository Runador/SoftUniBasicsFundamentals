package ObjectsAndClassesExercise.AdvertisementMessage;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> phrases = Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can't live without this product.");

        List<String> events = Arrays.asList("Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!");

        List<String> authors = Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva");

        List<String> cities = Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int randomPhrase = random.nextInt(phrases.size());
            int randomEvent = random.nextInt(events.size());
            int randomAuthor = random.nextInt(authors.size());
            int randomCity = random.nextInt(cities.size());

            String phrase = phrases.get(randomPhrase);
            String event = events.get(randomEvent);
            String author = authors.get(randomAuthor);
            String city = cities.get(randomCity);

            String message = phrase + " " + event + " " + author + " - " + city;
            System.out.println(message);

        }

    }
}

