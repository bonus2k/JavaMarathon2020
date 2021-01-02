package day8;

public class Task1 {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i <= 20000; i++) {
            str += " " + i;
        }
        Long stop = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (stop - start));
        //System.out.println(str);

        start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(" ");
            stringBuilder.append(i);
        }
        stop = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (stop - start));
        //System.out.println(stringBuilder);
    }
}
