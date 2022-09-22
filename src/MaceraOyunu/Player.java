package MaceraOyunu;

import MaceraOyunu.GameCharacters.GameCharacters;
import MaceraOyunu.GameCharacters.characters.Archer;
import MaceraOyunu.GameCharacters.characters.Knight;
import MaceraOyunu.GameCharacters.characters.Samurai;

import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner scanner = new Scanner(System.in);



    // Sadece kullanici adini kullancidan alacagimiz icin diger degiskenleri eklememize gerek yoktur.
    public Player(String name) {
        this.name = name;
    }

    public int getDamage() {
        return this.damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getMoney() {
        return this.money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() { return this.charName;}
    public void setCharName(String charName) {
        this.charName = charName;
    }





    public void selectedChar() {
        /*
        Samurai samurai = new Samurai();
        Archer archer = new Archer();
        Knight knight = new Knight();

        kisaca ucunude GameCharacters sinifa gonderebiliriz.
        Hepsi zaten GameCharacters sinifini extends etmektedir.
         */


        GameCharacters[] charList = {new Samurai(), new Archer(), new Knight()};

        System.out.println("-----------------------------");

        /*
        System.out.println("Karakter : Samuray \t Hasar : 5 \t Saglik : 21 \t Para : 15");
        System.out.println("Karakter : Okcu \t Hasar : 7 \t Saglik : 18 \t Para : 20");
        System.out.println("Karakter : Sovalye \t Hasar : 8 \t Saglik : 24 \t Para : 5");

        tanimladigimiz foreach ile hepsini tek bir satirda yazdiracagiz
         */


        for (GameCharacters gameCharacters : charList) {
            System.out.println("Id: " + gameCharacters.getId()+ " Karakter : " + gameCharacters.getName()+ " \t Hasar : " + gameCharacters.getDamage() + " \t Saglik : " + gameCharacters.getHealth()+ " \t Para : " + gameCharacters.getMoney());
        }
        System.out.println("-----------------------------");
        System.out.print("Lutfen bir karakter seciniz : ");
        int selectChar = scanner.nextInt();

        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakteriniz : " + this.getCharName() + ", Hasar puaniniz : " + this.getDamage() + ", Saglik puaniniz : " + this.getHealth() + ", Paraniz : " + this.getMoney());
    }


    public void initPlayer(GameCharacters gameCharacters) {
        this.setCharName(gameCharacters.getName());
        this.setDamage(gameCharacters.getDamage());
        this.setHealth(gameCharacters.getHealth());
        this.setMoney(gameCharacters.getMoney());

    }
}
