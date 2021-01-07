package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> beatlesList = new ArrayList<>();
        beatlesList.add(new MusicArtist("Пол Маккартни", 1950));
        beatlesList.add(new MusicArtist("Джон Леннон", 1945));
        beatlesList.add(new MusicArtist("Джордж Харрисон", 1946));
        beatlesList.add(new MusicArtist("Ринго Старр", 1951));
        MusicBand beatles = new MusicBand("The Beatles", 1960, beatlesList);

        List<MusicArtist> rslist = new ArrayList<>();
        rslist.add(new MusicArtist("Мик Джаггер", 1961));
        rslist.add(new MusicArtist("Кит Ричардс", 1962));
        rslist.add(new MusicArtist("Брайан Джонс", 1959));
        rslist.add(new MusicArtist("Ронни Вуд", 1960));
        MusicBand rs = new MusicBand("The Rolling Stones", 1962, rslist);

        MusicBand.transferMembers(beatles, rs);
        beatles.printMembers();
        rs.printMembers();
    }
}
