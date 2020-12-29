package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1985);
        car.setColor("красный");
        car.setModel("Жигули");

        Motorbike motorbike = new Motorbike("Suzuki", "белый", 2020);

        car.info();
        motorbike.info();

        System.out.println("Возраст машины: " + car.yearDifference(2021) + " лет");
        System.out.println("Возраст мотоцикла: " + motorbike.yearDifference(2021) + " год");
    }
}
