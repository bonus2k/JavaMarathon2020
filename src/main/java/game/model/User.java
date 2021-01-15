package game.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int COUNT_USER = 0;
    private final String NAME;
    private final List<Ship> SHIPS = new ArrayList<>();
    private String[][] sea = new String[10][10];

    public User(String NAME) {
        this.NAME = NAME;
        SHIPS.add(new Ship("четырёхпалубный", 4));
        SHIPS.add(new Ship("трёхпалубный", 3));
        SHIPS.add(new Ship("трёхпалубный", 3));
        SHIPS.add(new Ship("двухпалубный", 2));
        SHIPS.add(new Ship("двухпалубный", 2));
        SHIPS.add(new Ship("двухпалубный", 2));
        SHIPS.add(new Ship("однопалубный", 1));
        SHIPS.add(new Ship("однопалубный", 1));
        SHIPS.add(new Ship("однопалубный", 1));
        SHIPS.add(new Ship("однопалубный", 1));
        createSea();
        COUNT_USER++;
    }

    public static int getCountUser() {
        return COUNT_USER;
    }

    public static void delUser() {
        COUNT_USER--;
    }

    public List<Ship> getSHIPS() {
        return SHIPS;
    }

    public String getNAME() {
        return NAME;
    }

    public String[][] getSea() {
        return sea;
    }

    public void setSea(String[][] sea) {
        this.sea = sea;
    }

    private void createSea() {
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea[0].length; j++) {
                sea[i][j] = "# ";
            }
        }
    }

}
