package FundamentalsMiddleExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chatList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            String message = tokens[1];
            if (command.equals("Chat")) {
                chatList.add(message);
            } else if (command.equals("Delete")) {
                chatList.remove(message);
            } else if (command.equals("Edit")) {
                String editedVersion = tokens[2];
                if (chatList.contains(message)) {
                    chatList.set(chatList.indexOf(message), editedVersion);
                }
            } else if (command.equals("Pin")) {
                if (chatList.contains(message)) {
                    chatList.add(chatList.get(chatList.indexOf(message)));
                    chatList.remove(message);
                }
            } else if (command.equals("Spam")) {
                for (int i = 1; i < tokens.length; i++) {
                    String messageToAdd = tokens[i];
                    chatList.add(messageToAdd);
                }
            }

            input = scanner.nextLine();
        }

        for (String element : chatList) {
            System.out.println(element + " ");
        }

    }
}
