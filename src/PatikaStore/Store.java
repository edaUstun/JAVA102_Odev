package PatikaStore;

import java.util.Scanner;

public class Store {
    Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("PatikaStore Urun Yonetim Paneli !");

            System.out.println("*********************************");

            System.out.println("Yapilacak islemi seciniz :");
            System.out.println("1 - Notebook Islemleri");
            System.out.println("2 - Cep Telefonu Islemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Cikis Yap");
            int secim = scanner.nextInt();

            System.out.println("Tercihiniz : " + secim);

            switch (secim) {
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.menu();
                    break;
                case 2:
                    Phone phone = new Phone();
                    phone.menu();
                    break;
                case 3:
                    Brand.printBrands();
                    break;
                case 0:
                    System.out.println("Cikis Yapiliyor.");
                    System.out.println("Cikis Yapildi.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hatali Giris");
                    break;
            }
        }
    }
}
