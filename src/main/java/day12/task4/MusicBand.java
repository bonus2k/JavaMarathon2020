package day12.task4;

import java.util.List;

public class MusicBand {
    private final String name;
    private final Integer year;
    private List<String> members;

    public MusicBand(String name, Integer year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public Integer getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand musicBandA, MusicBand musicBandB) {
        List<String> bandA = musicBandA.getMembers();
        List<String> bandB = musicBandB.getMembers();
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
