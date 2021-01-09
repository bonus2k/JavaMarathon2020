package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File inFile = new File("src/main/resources/shoes.csv");
        File outFile = new File("src/main/resources/missing_shoes.txt");

        try (Scanner scanner = new Scanner(inFile);
             PrintWriter printWriter = new PrintWriter(outFile)) {
            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                if (str.matches(".+;0$")) {
                    printWriter.println(str);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
