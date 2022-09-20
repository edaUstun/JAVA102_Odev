package Java102.Static;

public class User {

    public String name;
    public static int counter;

    {
        System.out.println("Ben bir static kod bloguyum ve her nesne olusturuldugunda calisirim.");
    }


    static {
        // System.out.println("Ben sadece sinifin olustugunda bir kez calisan static kod bloguyum. Ve ilk ben calisirim.");
        // System.out.println("=====================================================");

        int random = (int) (Math.random() * 10);
        System.out.println("Random Sayi : " + random);
        counter = random;
    }

    public User (String name) {
        this.name = name;
        counter++;
    }
}
