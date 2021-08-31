package javaLessons.lessons6;

public class Main {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("жёлтый", 2011, "H213");
        Airplane  airplane = new Airplane("Alenia", 2018, 25, 50000);
        Teacher teacher = new Teacher("Светлана Николаевна", "математика");
        Student student = new Student("Максим");
        motorbike.info();
        airplane.fillUp(20);
        airplane.fillUp(35);
        airplane.setYear(2019);
        airplane.setLength(30);
        System.out.println("Этому мотоциклу после выпсука уже лет " + motorbike.yearDifference(2021) + "!");
        System.out.println("Он из модели " + motorbike.getModel() + ", выпущенная в " + motorbike.getYearOfIssue() + " году, имеет " + motorbike.getColor() + " цвет!");
        System.out.println();
        airplane.info();
        System.out.println();
        teacher.evaluate(student);
    }

}

