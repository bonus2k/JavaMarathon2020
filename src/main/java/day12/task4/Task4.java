package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> beatlesList = new ArrayList<>();
        beatlesList.add("Пол Маккартни");
        beatlesList.add("Джон Леннон");
        beatlesList.add("Джордж Харрисон");
        beatlesList.add("Ринго Старр");
        MusicBand beatles = new MusicBand("The Beatles", 1960, beatlesList);

        List<String> rslist = new ArrayList<>();
        rslist.add("Мик Джаггер");
        rslist.add("Кит Ричардс");
        rslist.add("Брайан Джонс");
        rslist.add("Ронни Вуд");
        MusicBand rs = new MusicBand("The Rolling Stones", 1962, rslist);

        MusicBand.transferMembers(beatles, rs);
        beatles.printMembers();
        rs.printMembers();
    }
}
