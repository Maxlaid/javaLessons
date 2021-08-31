package javaLessons.lessons6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.setName(name);
        this.setSubject(subject);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        String evaluate = "";
        final int min = 2;
        final int max = 5;
        final int rnd = rnd(min, max);
        switch (rnd) {
            case 2:
                evaluate = "неудовлетворительно";
                break;
            case 3:
                evaluate = "удовлетворительно";
                break;
            case 4:
                evaluate = "хорошо";
                break;
            case 5:
                evaluate = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.getName() + " оценила студента с именем " + student.getNameStudent() + " по предмету " + this.getSubject() + " на оценку " + evaluate + "!");
    }

    public int rnd(int min, int max) {
        Random random = new Random();
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
