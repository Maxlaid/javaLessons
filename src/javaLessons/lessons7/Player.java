package javaLessons.lessons7;

public class Player {
    private int stamina;
    int MAX_STAMINA = 100;
    int MIN_STAMINA = 0;
    public static int countPlayers;

public Player(int stamina) {
    this.stamina = stamina;

    if (countPlayers < 6){
        countPlayers++;
    }

}

   public void run(){
   if (stamina == 0)
    return;
   countPlayers--;
   stamina--;



    }
    public static void info(){

    if (countPlayers < 6){
        System.out.println("Команды не полные, есть ещё " + (6 - countPlayers) + " места свободное!");
    } else {
        System.out.println("Места пока что заняты!");
    }
}
}
