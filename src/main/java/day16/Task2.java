package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        generateIntegerInFile(file1);
        countingTwentyNumbersFromFile(file1, file2);
        printResult(file2);

    }

    public static void printResult(File file) {
        Integer sum = null;
        try (Scanner scanner = new Scanner(file)) {
            sum = (int) Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .sum();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }

    public static void generateIntegerInFile(File file) {
        Random random = new Random();
        try (PrintWriter printWriter = new PrintWriter(file)) {
            StringJoiner sj = new StringJoiner(" ");
            for (int i = 0; i < 1000; i++) {
                sj.add(random.nextInt(100) + "");
            }
            printWriter.print(sj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void countingTwentyNumbersFromFile(File file1, File file2) {
        String[] allNumbers = null;
        StringJoiner sj = new StringJoiner(" ");
        int count = 0;
        double sum = 0;
        try (Scanner scanner = new Scanner(file1);
             PrintWriter printWriter = new PrintWriter(file2)) {

            allNumbers = scanner.nextLine().split(" ");

            for (String numbers : allNumbers) {
                if (count < 20) {
                    sum += Integer.parseInt(numbers);
                    count++;
                } else {
                    sj.add(sum / 20 + "");
                    count = 0;
                    sum = 0;
                }
            }

            printWriter.println(sj);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
