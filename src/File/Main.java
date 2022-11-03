package File;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        /*
        File dizin = new File("src/File/patika/dev");

        // mkdirs -> olmayan birden fazla dosya dizini icin kullanilir.
        // olmayan klasorleri tanimlar
        System.out.println(dizin.mkdirs());

        // mkdir -> dosya yolu klasoru olusturma
        // System.out.println(dizin.mkdir());


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
         */

        File dizin = new File("src/File/test");

        // dizin.list() -> string dizi dondurur - string e esitledik
        String[] list = dizin.list();

        // bu sekilde o dizindeki elemanlari verir.
        for(String str : list) {
            System.out.println(str);
        }
    }
}
