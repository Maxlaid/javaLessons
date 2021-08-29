package javaLessons.lessons5;

public class Main {
    public static void main(String[] args) {
        Motorbike honda = new Motorbike("жёлтый", 2011, "H213");

        System.out.println("Это мотоцикл из модели " + honda.getModel() + ", выпущенная в " + honda.getYearOfIssue() + " году, имеет " + honda.getColor() + " цвет!");
    }
}

