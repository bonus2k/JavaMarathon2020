package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("The Beatles", 1960));
        musicBands.add(new MusicBand("The Rolling Stones", 1962));
        musicBands.add(new MusicBand("AC/DC", 1973));
        musicBands.add(new MusicBand("Metallica", 1981));
        musicBands.add(new MusicBand("Guns N’ Roses", 1985));
        musicBands.add(new MusicBand("Мумий Тролль", 1983));
        musicBands.add(new MusicBand("Tokio Hotel", 2001));
        musicBands.add(new MusicBand("Stigmata", 2000));
        musicBands.add(new MusicBand("ДоЗавтра", 2007));
        musicBands.add(new MusicBand("Fall Out Boy", 2001));

        Collections.shuffle(musicBands);
        musicBands.forEach(System.out::println);
        System.out.println("----------------------");
        groupsAfter2000(musicBands).forEach(System.out::println);
    }


    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> newList = bands.stream()
                .filter(band -> band.getYear() > 2000)
                .collect(Collectors.toList());
        return newList;
    }
}
