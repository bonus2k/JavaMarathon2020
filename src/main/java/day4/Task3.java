package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();
        int max = 0;
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int tempSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(50);
                tempSum += matrix[i][j];
            }
            if (tempSum > sum) {
                sum = tempSum;
                max = i;
            }
        }
//        for (int[] i : matrix) {
//            System.out.println(Arrays.toString(i) + " - " + Arrays.stream(i).sum());
//        }
        System.out.println("Индекс строки с максимальной суммой: " + max);
    }
}
