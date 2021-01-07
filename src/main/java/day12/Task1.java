package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Opel");
        cars.add("Honda");
        cars.add("KIA");
        cars.add("Lada");

        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("-----------------");

        cars.add(3, "Toyota");
        cars.remove(0);

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
