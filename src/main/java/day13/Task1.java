package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");
        user2.sendMessage(user1, "Привет");
        user2.sendMessage(user1, "Все хорошо");
        user2.sendMessage(user1, "Как твоя поездка?");
        user3.sendMessage(user1, "Здравствуйте!");
        user3.sendMessage(user1, "Это Татьяна");
        user3.sendMessage(user1, "Мы договаривались созвониться в пятницу");
        user1.sendMessage(user3, "Добрый день!");
        user1.sendMessage(user3, "Я заболел и не смогу присутствовать на встрече");
        user1.sendMessage(user3, "Я оповестил коллег об изменениях");
        user3.sendMessage(user1, "Большое спасибо! Выздоравливайте");

        MessageDatabase.showDialog(user1, user3);

//        user2.subscribe(user1);
//        user1.subscribe(user2);
//        System.out.println(user1.isFriend(user2));
//        System.out.println(user2.isFriend(user1));
//        System.out.println(user2.isSubscribed(user1));
//        System.out.println(new Message(user1, user2, "Test message"));
    }
}
