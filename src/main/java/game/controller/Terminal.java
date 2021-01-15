package game.controller;

import game.model.Ship;
import game.model.User;
import game.model.Utils;
import game.view.Field;

import java.util.Scanner;

public class Terminal {
    private final Scanner scanner;
    private static Terminal instance;

    private Terminal() {
        this.scanner = new Scanner(System.in);
    }

    public static Terminal getInstance() {
        if (instance == null) {
            instance = new Terminal();
        }
        return instance;
    }

    public User createUser() {
        System.out.printf("Введите имя игрока №%d: ", User.getCountUser() + 1);
        return new User(scanner.nextLine());
    }

    public void inputShip(User user) {
        System.out.printf("Привет %s! Давай расположим твои корабли на игровом поле\n", user.getNAME());
        Field.showFieldStart(user.getSea(), user);
        for (Ship ship : user.getSHIPS()) {
            if (!ship.isLive()) {
                System.out.printf("Введи координаты расположения носа %s коробля (7C): ", declension(ship.getName()));
                inputPosition(ship);
                if (ship.getLength() > 1) {
                    System.out.printf("Введи расположение %s коробля (H/V - гор./вер.): ", declension(ship.getName()));
                    inputIsVertically(ship);
                }
                if (!Utils.createShipOnField(user)) {
                    System.err.print("Корабль не может выходит за край игрового поля\nили пересекаться с другим кораблем\n");
                    ship.setLive(false);
                    inputShip(user);
                }
                Field.showFieldStart(user.getSea(), user);
            }
        }
        System.out.printf("%s, корабли расположенны верно? (Y/N) ", user.getNAME());
        reInputShip(user);
    }

    private void reInputShip(User user) {
        String input;
        while ((input = scanner.nextLine()) != null) {
            if (input.equalsIgnoreCase("Y")) {
                return;
            } else if (input.equalsIgnoreCase("N")) {
                User.delUser();
                user = new User(user.getNAME());
                inputShip(user);
                return;
            } else System.err.print("Неправильный ввод, повторите попытку (Y/N):");
        }
    }

    private void inputIsVertically(Ship ship) {
        String input;
        while ((input = scanner.nextLine()) != null) {
            if (input.equalsIgnoreCase("H")) {
                ship.setVertically(false);
                return;
            } else if (input.equalsIgnoreCase("V")) {
                ship.setVertically(true);
                return;
            } else System.err.print("Неправильный ввод, повторите попытку (H/V - гор./вер.):");
        }
    }

    private void inputPosition(Ship ship) {
        String input;
        while ((input = scanner.nextLine()) != null) {
            input = input.toUpperCase();

            if (input.matches("^[0-9]{1}[A-J]{1}$")) {
                char num = input.charAt(0);
                ship.setPositionY((int) num - 48);

                char ch = input.charAt(1);
                ship.setPositionX((int) ch - 65);

                ship.setLive(true);
                return;
            } else
                System.err.print("Неправильный ввод, повторите попытку (введи координаты по оси X и Y например 6D):");
        }
    }

    private String declension(String string) {
        return string.substring(0, string.length() - 2) + "ого";
    }

    public String inputFire() {
        String input;
        System.out.print("Введите координаты выстрела (5J):");
        while ((input = scanner.nextLine()) != null) {
            input = input.toUpperCase();

            if (!input.matches("^[0-9]{1}[A-J]{1}$")) {
                System.err.print("Неправильный ввод, повторите попытку (введи координаты по оси X и Y например 6D):");
            } else break;
        }
        return input;
    }
}
