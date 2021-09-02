package javaLessons.lessons7;

public class Airplane {

    public String producer;
    public int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.setLength(length);
        this.setWeight(weight);
        this.setFuel(0);
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }


    public void info() {
        System.out.println("Изготовитель: " + producer + "," + " год выпуска: " + year + " года, " + "длина: " + getLength() + " метров, " + "вес: " + getWeight() + " кг," + " количество топлива в баке: " + getFuel());
    }

    public void fillUp(int additionFuel) {
        fuel += additionFuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
if(airplane1.getLength() > airplane2.getLength()) {
    System.out.println("Первый самолёт длинее второго!");
} else if(airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Второй самолёт длинее первого!");
        }
    }

}
