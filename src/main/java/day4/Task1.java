package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.printf("Введено число %d. Сгенерирован следующий массив:\n%s\n",
                array.length, Arrays.toString(array));

        int countMax8 = 0;
        int countOne = 0;
        int countEven = 0;
        int countUneven = 0;
        int sumArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) countMax8++;
            if (array[i] == 1) countOne++;
            if (array[i] % 2 == 0) countEven++;
            else countUneven++;
            sumArray += array[i];
        }

        System.out.printf("Длина массива: %d\n", array.length);
        System.out.printf("Количество чисел больше 8: %d\n", countMax8);
        System.out.printf("Количество чисел равных 1: %d\n", countOne);
        System.out.printf("Количество четных чисел: %d\n", countEven);
        System.out.printf("Количество нечетных чисел: %d\n", countUneven);
        System.out.printf("Сумма всех элементов массива: %d\n", sumArray);
    }
}
