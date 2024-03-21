package Maps.MapsLambdaAndStreamAPIExercises;

import java.util.*;
import java.util.stream.Collectors;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split(" ");
            String companyName = tokens[0];
            String employeeID = tokens[2];

            if (!companyMap.containsKey(companyName)) {
                companyMap.put(companyName, new ArrayList<>());
                companyMap.get(companyName).add(employeeID);
            } else {
                companyMap.get(companyName).add(employeeID);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyMap.entrySet()) {

            List<String> idWithoutDuplicates = entry.getValue()
                    .stream().distinct().collect(Collectors.toList());

            companyMap.put(entry.getKey(), idWithoutDuplicates);

            System.out.printf("%s%n", entry.getKey());

            for (String personID: entry.getValue()) {
                System.out.printf("-- %s%n", personID);
            }

        }

    }
}
