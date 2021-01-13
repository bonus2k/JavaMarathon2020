package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] array, int x) {
        int sum = 0;
        if (x < array.length - 1) {
            sum = array[x] + recursionSum(array, x + 1);
            x++;
        } else sum += array[x];
        return sum;
    }
}
