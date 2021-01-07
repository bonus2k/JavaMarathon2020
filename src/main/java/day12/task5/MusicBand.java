package day12.task5;

import java.util.List;

public class MusicBand {
    private final String name;
    private final Integer year;
    private List<MusicArtist> members;

    public MusicBand(String name, Integer year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public Integer getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand musicBandA, MusicBand musicBandB) {
        List<MusicArtist> bandA = musicBandA.getMembers();
        List<MusicArtist> bandB = musicBandB.getMembers();
        bandB.addAll(bandA);
        bandA.clear();
        musicBandA.setMembers(bandA);
        musicBandB.setMembers(bandB);
    }

    public void printMembers() {
        System.out.println(members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
