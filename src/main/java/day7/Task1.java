package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing-747", 2010, 55, 20);
        Airplane airplane2 = new Airplane("Boing-777", 2015, 50, 22);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}