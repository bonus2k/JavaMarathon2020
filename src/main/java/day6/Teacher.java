package day6;

import java.util.Random;

public class Teacher {
    private final String name;
    private final String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        String grades = null;
        Random random = new Random();
        int rnd = random.nextInt(4) + 2;
        switch (rnd) {
            case 2:
                grades = "неудовлетворительно";
                break;
            case 3:
                grades = "удовлетворительно";
                break;
            case 4:
                grades = "хорошо";
                break;
            case 5:
                grades = "отлично";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента с именем " +
                        "%s по предмету %s на оценку %s.\n",
                name, student.getName(), subject, grades);
    }
}
