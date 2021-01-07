package day13;


import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static final List<Message> messages = new ArrayList<>();

    private MessageDatabase() {
    }

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        messages.stream()
                .filter(m -> m.getSender().equals(u1)
                        && m.getReceiver().equals(u2)
                        || m.getSender().equals(u2)
                        && m.getReceiver().equals(u1))
                .forEach(m -> System.out.println
                        (m.getSender().getUsername() + ": " + m.getText()));
    }


}
