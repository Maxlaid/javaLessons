package javaLessons.lessons7;


public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Alenia", 2018, 25, 50000);
        Airplane airplane2 = new Airplane("Alenia", 2018, 25, 50000);
        airplane1.fillUp(20);
        airplane2.fillUp(35);
        airplane1.setYear(2019);
        airplane2.setLength(40);

        Airplane.compareAirplanes(airplane1, airplane2);


        Player player1 = new Player(91);
        Player player2 = new Player(93);
        Player player3 = new Player(90);
        Player.info();
        Player player4 = new Player(98);
        Player player5 = new Player(96);
        Player player6 = new Player(91);
        Player.info();
        Player player7 = new Player(99);
        Player.info();
        player1.run();
        Player.info();
    }
}

