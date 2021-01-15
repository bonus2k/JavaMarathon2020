package game.model;

import java.io.*;
import java.util.List;

public class Utils {

    public static boolean createShipOnField(User user) {
        List<Ship> ships = user.getSHIPS();
        String[][] sea = cloneArray(user.getSea());
        boolean isCreate = false;
        if (sea != null) {
            for (Ship ship : ships) {
                if (ship.isLive()) {
                    if (ship.isVertically()) {
                        isCreate = createVerticallyShip(ship, sea);
                    } else isCreate = createHorizontallyShip(ship, sea);
                }
            }

            if (isCreate) {
                user.setSea(sea);
            }
        }
        return isCreate;
    }

    private static boolean createHorizontallyShip(Ship ship, String[][] sea) {
        Integer X = ship.getPositionX();
        Integer Y = ship.getPositionY();
        Integer length = ship.getLength();

        for (int i = 0; i < length; i++) {
            try {
                if (!sea[X + i][Y].equalsIgnoreCase("0 ")) {
                    sea[X + i][Y] = "0 ";
                } else return false;
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }
        }
        return true;
    }

    private static boolean createVerticallyShip(Ship ship, String[][] sea) {
        Integer X = ship.getPositionX();
        Integer Y = ship.getPositionY();
        Integer length = ship.getLength();

        for (int i = 0; i < length; i++) {
            try {
                if (!sea[X][Y + i].equalsIgnoreCase("0 ")) {
                    sea[X][Y + i] = "0 ";
                } else return false;
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }
        }
        return true;
    }

    private static String[][] cloneArray(String[][] sea) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream ous = new ObjectOutputStream(baos)) {
            ous.writeObject(sea);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[][] newSea = null;
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        try (ObjectInputStream ois = new ObjectInputStream(bais)) {
            newSea = (String[][]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newSea;
    }

    public static boolean fire(String input, User user) {
        char num = input.charAt(0);
        Integer Y = ((int) num - 48);
        char ch = input.charAt(1);
        Integer X = ((int) ch - 65);


        String[][] sea = user.getSea();
        if (sea[X][Y].equalsIgnoreCase("0 ")) {
            sea[X][Y] = "* ";
            return true;
        } else return false;
    }

    public static boolean isWin(User user) {
        boolean isWin = true;
        String[][] sea = user.getSea();
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea[0].length; j++) {
                if (sea[i][j].equalsIgnoreCase("0 ")) {
                    isWin = false;
                }
            }
        }
        return isWin;
    }
}
