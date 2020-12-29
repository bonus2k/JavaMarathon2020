package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Мария Ивановна", "математика");
        Student student = new Student("Вася");
        teacher.evaluate(student);
    }
}
