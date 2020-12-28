package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2020, "белый", "Suzuki");
        System.out.printf("Модель: %s, цвет: %s, год выпуска: %d",
                motorbike.getModel(), motorbike.getColor(), motorbike.getYear());
    }
}
