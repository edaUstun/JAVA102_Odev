package File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        /*
        --- FILE OUT STREAM ---
        --- Veri Yazma --- --- Disariya Veri Verme ---
        ==============================================
         */

        String name = "\nOutputStream\nPotato";
        try {
            // icerideki dosya adinda bir dosya yoksa Direkt Dosyayi olusuturur.
            // yazdigimiz dosya var ise o dosyanin icindekileri SILER.
            // FileOutputStream outputStream = new FileOutputStream("src/File/name.txt");

            // icindeki degerleri silmesin diye true tanimlamasi yapilir - bu sekilde ustune baska verilerde yazabiliriz.
            FileOutputStream outputStream = new FileOutputStream("src/File/name.txt", true);

            byte[] nameArray = name.getBytes();

            // tanimli dosya (name.txt) icine yazma islemi yapmak icin - byte array tipinde
            outputStream.write(nameArray);
            outputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        /*

        --- FILE IN STREAM ---
        --- Veri Okuma --- --- Disaridan Veri Alma ---
        ==============================================
        File dizin = new File("src/File/patika/dev");

        // mkdirs -> olmayan birden fazla dosya dizini icin kullanilir.
        // olmayan klasorleri tanimlar
        System.out.println(dizin.mkdirs());

        // mkdir -> dosya yolu klasoru olusturma
        // System.out.println(dizin.mkdir());


        // --- Dosya Olusturma ---
        File file = new File("src/File/test/name.txt");

        try {
            if (file.createNewFile()) {
                System.out.println(file.getName() + " dosya olusturuldu.");
            } else {
                System.out.println(file.getName() + " mevcut dosya bulunmaktadir.");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // dosya silme - sildi ise true - silinmis ise false - dondurur
        //System.out.println(file.delete());



        // --- Dizin Ekleme ----
        File dizin = new File("src/File/test");

        // dizin.list() -> string dizi dondurur - string e esitledik
        String[] list = dizin.list();

        // bu sekilde o dizindeki elemanlari verir.
        for(String str : list) {
            System.out.println(str);
        }



        // FileInputStream ve read() fonksiyonu

        try {

            // --Farkli bir kullanim--

            // File file = new File("src/File/patika.txt");
            // FileInputStream input = new FileInputStream(file);

            FileInputStream fileInput = new FileInputStream("src/File/patika.txt");

            // input.read() -> dosyanin icindeki ilk degerin input degerini verir.
            // System.out.println(input.read());


            // File icindeki degerleri byte byte okuma
            int i = fileInput.read();

            // input.skip(10) -> (10. karakterden baslamak) istenilen karakterden yazdirmaya baslamak icin
            while (i != -1) {
                System.out.print((char) i);
                i = fileInput.read();
            }
            fileInput.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // --- AVAILABLE ---
        try {
            FileInputStream fileInput = new FileInputStream("src/File/patika.txt");

            // fileInput.available() -> dosya icindeki byte sayisini verir.
            System.out.println("Kullanilabilir byte sayisi " + fileInput.available());

            fileInput.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


         */


    }
}
