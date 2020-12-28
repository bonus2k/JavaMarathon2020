package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1985);
        car.setColor("красный");
        car.setModel("Жигули");

        System.out.printf("Модель: %s, цвет: %s, год выпуска: %d",
                car.getModel(), car.getColor(), car.getYear());
    }
}
