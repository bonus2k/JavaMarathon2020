package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult(new File("numbers.txt"));
    }

    public static void printResult(File file) {
        String input = "";
        double countSum = 0.0;
        try (Scanner scanner = new Scanner(file)) {
            input = scanner.nextLine();
            String[] arrayInput = input.split(" ");
            for (String digit : arrayInput) {
                countSum += Double.parseDouble(digit);
            }
            countSum /= arrayInput.length;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.printf(countSum + " --> %.3f", countSum);
    }
}

