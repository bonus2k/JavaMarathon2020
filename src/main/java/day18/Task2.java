package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(1777777777));
    }

    public static int count7(int numbers) {
        int count7 = 0;
        int temp = numbers;

        if (numbers > 0) {
            numbers = numbers / 10;
            if (temp - numbers * 10 == 7) {
                count7 = ++count7 + count7(numbers);
            } else count7 += count7(numbers);
        }
        return count7;
    }
}
