package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina = (stamina > MIN_STAMINA) ? --stamina : 0;
            if (stamina == MIN_STAMINA) --countPlayers;
        }
    }

    public static void info() {
        if (countPlayers == 6) System.out.println("На поле нет свободных мест");
        else System.out.printf("На поле еще есть %d свободных мест\n", 6 - countPlayers);
    }
}
