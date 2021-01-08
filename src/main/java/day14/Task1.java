package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
            if (sum != 10) {
                throw new ArithmeticException();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ArithmeticException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
