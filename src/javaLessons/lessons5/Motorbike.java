package javaLessons.lessons5;

public class Motorbike {
    public String getColor() {
        return Color;
    }

    public int getYearOfIssue() {
        return YearOfIssue;
    }

    public String getModel() {
        return Model;
    }

    public String Color;
        public int YearOfIssue;
        public String Model;

    public Motorbike(String color, int yearOfIssue, String model) {
        this.Color = color;
        this.YearOfIssue = yearOfIssue;
        this.Model = model;
    }
}

