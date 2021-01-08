package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> peopleList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String nameAndAge = scanner.nextLine();
                String age = nameAndAge.substring(nameAndAge.indexOf(" ") + 1);
                if (Integer.parseInt(age) < 0) {
                    throw new ArithmeticException();
                }
                peopleList.add(nameAndAge);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ArithmeticException e) {
            System.out.println("Некорректный входной файл");
            return null;
        }
        return peopleList;
    }
}
