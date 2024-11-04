package P_05_11_24;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phrasesList = new ArrayList<>() { {
                add("Excellent product.");
                add("Such a great product.");
                add("I always use that product.");
                add("Best product of its category.");
                add("Exceptional product.");
                add("I can’t live without this product.");
            }
        };

        List<String> eventsList = new ArrayList<>() { {
            add("Now I feel good.");
            add("I have succeeded with this product.");
            add("Makes miracles. I am happy of the results!");
            add("I cannot believe but now I feel awesome.");
            add("Try it yourself, I am very satisfied.");
            add("I feel great!");
        }
        };

        List<String> authorsList = new ArrayList<>() { {
            add("Diana");
            add("Petya");
            add("Stella");
            add("Elena");
            add("Katya");
            add("Iva");
            add("Annie");
            add("Eva");
        }
        };

        List<String> citiesList = new ArrayList<>() { {
            add("Burgas");
            add("Sofia");
            add("Plovdiv");
            add("Varna");
            add("Ruse");
        }
        };

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int randomPhrase = random.nextInt(phrasesList.size());
            int randomEvent = random.nextInt(eventsList.size());
            int randomAuthor = random.nextInt(authorsList.size());
            int randomCity = random.nextInt(citiesList.size());

            String phrase = phrasesList.get(randomPhrase);
            String event = eventsList.get(randomEvent);
            String author = authorsList.get(randomAuthor);
            String city = citiesList.get(randomCity);

            System.out.printf("%s %s %s – %s%n", phrase, event, author, city);
        }
    }
}
