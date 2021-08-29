package javaLessons.lessons5;

public class Car {
    private String Color;
    private int YearOfIssue;
    private String Model;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getYearOfIssue() {
        return YearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        YearOfIssue = yearOfIssue;
    }


    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public static class MyCar {

        public static void main(String[] args) {
            Car car = new Car();
            car.setColor("чёрный");
            car.setYearOfIssue(2005);
            car.setModel("BMW");
            System.out.println("Это машина из модели " + car.getModel() + ", выпущенная в " + car.getYearOfIssue() + " году, имеет " + car.getColor() + " цвет!");
        }

    }
}


