package Java102.Inheritance;

import Java102.Inheritance.AsistanCalisanlar.OgretimGorevlisi;
import Java102.Inheritance.Calisanlar.Akademisyen;
import Java102.Inheritance.Calisanlar.Memur;
import Java102.Inheritance.MemurCalisanlar.BilgiIslem;

public class Patika {

    public static void main(String[] args) {
        Calisan calisan1 = new Calisan("Mustafa Kaya", "05121231231", "a@gmail.com");

        System.out.println(calisan1.getFullName());
        calisan1.login();


        Akademisyen akademisyen1 = new Akademisyen("Selma Al", "05001111313", "b@gmail.com", "Matematik", "Ogrenci");
        System.out.println(akademisyen1.getFullName());
        akademisyen1.exit();
        akademisyen1.enterLesson();

        Memur memur1 = new Memur("Merve Ay", "03456785656", "c@gmail.com", "Bilgi Islem", "09:00-18:00");
        memur1.calis();


        OgretimGorevlisi ogretimGorevlisi1 = new OgretimGorevlisi("Lale Gul", "9458987439879", "d@gmail.com","Matematik", "Docent", "110");
        ogretimGorevlisi1.enterLesson(); // ogretimGorevlisi miras alir Akademisyen Classini
        ogretimGorevlisi1.exit();  // Akademisyen classi - Calisan Classini miras aldigi icin ogretimGorevlisi classida Calisan classina erisim saglayabilir
        System.out.println(ogretimGorevlisi1.getDoorNo());

        BilgiIslem bilgiIslem = new BilgiIslem("Murat Elma", "08059803387", "e@gmail.com", "Matematik", "09:00-17:00", "Docent");
        bilgiIslem.networkKurulumu();
        bilgiIslem.calis();
        bilgiIslem.login();
    }
}
