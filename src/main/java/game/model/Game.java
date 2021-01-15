package game.model;

import game.controller.Terminal;
import game.view.Field;

public class Game {
    public static void main(String[] args) throws InterruptedException {

        Terminal terminal = Terminal.getInstance();

        User user1 = terminal.createUser();
        User user2 = terminal.createUser();

        terminal.inputShip(user1);
        terminal.inputShip(user2);


        while (true) {
            System.out.printf("Ходит %s\n", user1.getNAME());
            Field.showBattleField(user2);
            while (Utils.fire(terminal.inputFire(), user2)) {
                System.out.println("ПОПАЛ!");
                Field.showBattleField(user2);
                if (Utils.isWin(user2)) {
                    break;
                }
            }
            if (Utils.isWin(user2)) {
                break;
            }

            System.out.printf("Мимо, ход переходит игроку %s\n", user2.getNAME());

            System.out.printf("Ходит %s\n", user2.getNAME());
            Field.showBattleField(user1);
            while (Utils.fire(terminal.inputFire(), user1)) {
                System.out.println("ПОПАЛ!");
                Field.showBattleField(user1);
                if (Utils.isWin(user1)) {
                    break;
                }
            }
            if (Utils.isWin(user1)) {
                break;
            }
            System.out.printf("Мимо, ход переходит игроку %s\n", user1.getNAME());
        }

        String winner = (Utils.isWin(user2)) ? user1.getNAME() : user2.getNAME();
        for (int i = 0; i < 20; i++) {
            Thread.sleep(100);
            if (i == 10) {
                System.out.printf("ПОБЕДИЛ %s!", winner);
            } else System.out.println();
        }
    }
}
