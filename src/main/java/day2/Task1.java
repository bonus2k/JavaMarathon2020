package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floor = scanner.nextInt();
//        while ((floor = scanner.nextInt()) < 1) {
//            System.out.printf("Ошибка ввода\n");
//        }
        if (floor < 1) System.out.printf("Ошибка ввода\n");
        else if (floor >= 1 && floor <= 4) System.out.println("Малоэтажный дом");
        else if (floor >= 5 && floor <= 8) System.out.println("Среднеэтажный дом");
        else System.out.println("Многоэтажный дом");
    }
}
