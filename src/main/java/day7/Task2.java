package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(Player.MAX_STAMINA - random.nextInt(11));
        Player player2 = new Player(Player.MAX_STAMINA - random.nextInt(11));
        Player player3 = new Player(Player.MAX_STAMINA - random.nextInt(11));
        Player player4 = new Player(Player.MAX_STAMINA - random.nextInt(11));
        Player player5 = new Player(Player.MAX_STAMINA - random.nextInt(11));
        Player player6 = new Player(Player.MAX_STAMINA - random.nextInt(11));
        Player player7 = new Player(Player.MAX_STAMINA - random.nextInt(11));

        System.out.println(Player.getCountPlayers());
        Player.info();

        while (player1.getStamina() > 0) {
            player1.run();
        }

        System.out.println(player1.getStamina());
        System.out.println(Player.getCountPlayers());
        Player.info();
    }
}
