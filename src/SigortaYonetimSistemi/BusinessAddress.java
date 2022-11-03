package SigortaYonetimSistemi;

import java.util.ArrayList;
import java.util.Scanner;

public class BusinessAddress implements IAddress{

    Scanner scanner = new Scanner(System.in);

    private int hId=0;
    private String country;
    private String city;
    private String district;

    private ArrayList<HomeAddress> homeAddresses = new ArrayList<>();

    public BusinessAddress(){}
    public BusinessAddress(String country, String city, String district) {

        this.country = country;
        this.city = city;
        this.district = district;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public void addAddress() {
        System.out.print("Ulke : ");
        country = scanner.nextLine();
        System.out.print("Sehir : ");
        city = scanner.nextLine();
        System.out.print("Sirket Ad : ");
        district = scanner.nextLine();
        System.out.print("Numara : ");

        HomeAddress home = new HomeAddress(country, city, district);
        this.homeAddresses.add(home);

    }

    @Override
    public void deleteAddress() {

        getProducts();
        System.out.println("Silinmek istenen Is Adres ID : ");
        int id = scanner.nextInt();
        homeAddresses.remove(id-1);

        System.out.println("Guncel Is Adres Listesi");
        getProducts();
    }


    public void getProducts() {
        print(null);
    }

    public void print(ArrayList<HomeAddress> homeAddressArrayList) {

        if (homeAddressArrayList==null) {
            homeAddressArrayList = this.homeAddresses;
        }

        System.out.println("Is Adresiniz : ");
        for (HomeAddress homeAddress : homeAddressArrayList) {
            System.out.println(
                    "Adres Id : " + homeAddress.gethId() + "\n" +
                            "Ulke : " + homeAddress.getCountry() + "\n" +
                            "Sehir : " + homeAddress.getCity() + "\n" +
                            "Sirket Ad : " + homeAddress.getStreet() + "\n"
            );
        }
    }
}
