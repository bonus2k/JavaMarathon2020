package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 2015, 15, 7);
        airplane.setYear(2016);
        airplane.setLength(20);
        airplane.fillUp(20);
        airplane.fillUp(6);
        airplane.info();
    }
}
