package kg.geektech.General;

import kg.geektech.Players.*;

import java.util.Random;

public class Logic {
   public static Random random = new Random();
    private static int roundNumber;
    private static  void playRound(Boss boss, Hero[] heroes){
        roundNumber++;
        boss.chooseDefence(heroes);
        boss.attack(heroes);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp()>0 && boss.getDefence() != heroes[i].getAbility()){
            heroes[i].attack(boss);
            heroes[i].applySP(heroes,boss);};
        }
        printStatistics(boss, heroes);
    }
    public static boolean isGameFinish(Boss boss, Hero[] heroes){
        if (boss.getHp()<= 0){
            System.out.println("Heroes won");
            return true;
        }
        boolean allHeroDie = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHp()>0){
                allHeroDie = false;
                break;
            }
            }if (allHeroDie){
            System.out.println("Boss won");
        }return  allHeroDie;
        }
    public static void start(){
        Boss boss = new Boss(1000,50 , " Rahim ");
        Magic magic = new Magic(280,20, " Sanzhar ");
        Warrior warrior = new Warrior(290, 10, " Meerim ");
        Medic doc = new Medic(250,5,15, " Artur ");
        Berserk berserk = new Berserk(270,15, " Tilek ");
        Medic junior = new Medic(260,5,5, " Gigachad ");
        Hero[] heroes = {warrior,doc,magic,berserk,junior};
        printStatistics(boss, heroes );
        while (!isGameFinish(boss,heroes)){
            playRound(boss,heroes);
        }
    }
    private static void printStatistics(Boss boss, Hero[] heroes){
        System.out.println("ROUND: " + roundNumber + "-----------------------------" );
        System.out.println(boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);

        }
    }
}
