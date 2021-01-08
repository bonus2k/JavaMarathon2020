package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> peopleList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String nameAndAge = scanner.nextLine();
                String name = nameAndAge.substring(0, nameAndAge.indexOf(" "));
                String ageStr = nameAndAge.substring(nameAndAge.indexOf(" ") + 1);
                int age = Integer.parseInt(ageStr);
                if (age < 0) {
                    throw new ArithmeticException();
                }
                peopleList.add(new Person(name, age));
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
