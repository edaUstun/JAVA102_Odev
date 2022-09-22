package Java102.MaceraOyunu;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyunana Hosgeldiniz !");
        System.out.print("Lutfen bir isim giriniz : ");
        //String playerName = scanner.next();

        Player player = new Player("selma");
        System.out.println("Sayin " + player.getName() + " Oyuna Hosgeldiniz !");
        System.out.println("Lutfen bir karakter seciniz : ");
        player.selectedChar();

        scanner.close();
    }


}
