package game.view;

import game.model.User;

public class Field {

    public static void showFieldStart(String[][] sea, User user) {

        System.out.println("  A B C D E F G H I J");
        for (int i = 0; i < sea.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < sea[0].length; j++) {
                System.out.print(sea[j][i]);
            }
            System.out.println();
        }
    }

    public static void showBattleField(User user) {
        String[][] sea = user.getSea();
        System.out.println("    A  B  C  D  E  F  G  H  I  J");
        for (int i = 0; i < sea.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < sea[0].length; j++) {
                if (sea[j][i].equalsIgnoreCase("* ")) {
                    System.out.print("\uD83D\uDD25" + "\uD83D\uDD25");

                } else System.out.print("\uD83C\uDF0A" + "\uD83C\uDF0A");
            }
            System.out.println();
        }
    }
}
