package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int max = array[0];
        int min = array[0];
        int countTen = 0;
        int sumTen = 0;

        for (int element : array) {
            if (element > max) max = element;
            if (element < min) min = element;
            if (element % 10 == 0) {
                countTen++;
                sumTen += element;
            }
        }

        System.out.printf("Наибольший элемент массива: %d\n", max);
        System.out.printf("Наименьший элемент массива: %d\n", min);
        System.out.printf("Количество элементов массива, оканчивающихся на 0: %d\n", countTen);
        System.out.printf("Сумму элементов массива, оканчивающихся на 0: %d\n", sumTen);
    }
}
