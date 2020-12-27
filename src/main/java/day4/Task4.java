package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int index = 0;
        int sum;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        sum = array[0] + array[1] + array[2];

        for (int i = 0; i < array.length - 2; i++) {
            int tempSum = array[i] + array[i + 1] + array[i + 2];
            if (tempSum > sum) {
                sum = tempSum;
                index = i;
            }
        }
//        System.out.println(Arrays.toString(array));
        System.out.printf("Максимальная сумма тройки: %d\nПервый индекс тройки: %d",
                sum, index);
    }
}
