package SigortaYonetimSistemi;

import java.util.Scanner;

public class AddressManager {

    private static Scanner scanner = new Scanner(System.in);

    public static void addAddress(User user) {
        IAddress newAddress;

        System.out.println("Yeni Adres Ekleme Alani : ");
        System.out.print("1- Ev Adresi \n2- Is Adresi \nAdres secimini giriniz : ");
        int address = scanner.nextInt();
        System.out.println("Ulke : ");
        String country = scanner.nextLine();
        System.out.println("Sehir : ");
        String city = scanner.nextLine();
        System.out.println("Ilce : ");
        String district = scanner.nextLine();


        if(address==1){
            newAddress = new HomeAddress(country, city, district);
        } else {
            newAddress = new BusinessAddress(country, city, district);
        }
        scanner.close();
    }

    public static void deleteAddress(User user, int id){

    }


}
