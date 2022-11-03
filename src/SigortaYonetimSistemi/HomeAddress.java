package SigortaYonetimSistemi;

import PatikaStore.Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeAddress implements IAddress{


    Scanner scanner = new Scanner(System.in);

    private int hId=0;
    private String country;
    private String city;
    private String street;

    private ArrayList<HomeAddress> homeAddresses = new ArrayList<>();

    public HomeAddress(){}
    public HomeAddress(String country, String city, String street) {

        this.country = country;
        this.city = city;
        this.street = street;
        hId++;
    }

    public int gethId() {
        return hId;
    }

    public void sethId(int hId) {
        this.hId = hId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    @Override
    public void addAddress() {
        System.out.print("Ulke : ");
        country = scanner.nextLine();
        System.out.print("Sehir : ");
        city = scanner.nextLine();
        System.out.print("Cadde : ");
        street = scanner.nextLine();
        System.out.print("Numara : ");

        HomeAddress home = new HomeAddress(country, city, street);
        this.homeAddresses.add(home);

    }

    @Override
    public void deleteAddress() {

        getProducts();
        System.out.println("Silinmek istenen Adres ID : ");
        int id = scanner.nextInt();
        homeAddresses.remove(id-1);

        System.out.println("Guncel Telefon Listesi");
        getProducts();
    }


    public void getProducts() {
        print(null);
    }

    public void print(ArrayList<HomeAddress> homeAddressArrayList) {

        if (homeAddressArrayList==null) {
            homeAddressArrayList = this.homeAddresses;
        }

        System.out.println("Adresiniz : ");
        for (HomeAddress homeAddress : homeAddressArrayList) {
            System.out.println(
                    "Adres Id : " + homeAddress.gethId() + "\n" +
                            "Ulke : " + homeAddress.getCountry() + "\n" +
                            "Sehir : " + homeAddress.getCity() + "\n" +
                            "Cadde : " + homeAddress.getStreet() + "\n"
            );
        }
    }
}
