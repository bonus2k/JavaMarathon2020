package day12.task3;

public class MusicBand {
    private final String name;
    private final Integer year;

    public MusicBand(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
