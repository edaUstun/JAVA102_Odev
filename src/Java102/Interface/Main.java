package Java102.Interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double price = scanner.nextDouble();
        System.out.print("Kart No giriniz: ");
        String cardNumber = scanner.next();
        System.out.print("Son Kullanim tarihi giriniz: ");
        String expiryDate = scanner.next();
        System.out.print("Guvenlik Kodunu giriniz: ");
        String cvc = scanner.next();



        System.out.println("1. A Bankasi: ");
        System.out.println("2. B Bankasi: ");
        System.out.println("3. C Bankasi: ");

        System.out.print("Banka Seciniz : ");
        int selectBank  = scanner.nextInt();

        switch (selectBank) {
            case 1:
                ABank aPos = new ABank("A Bankasi", "123123123", "1234512345");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber, expiryDate, cvc);
                break;
            case 2:
                BBank bPos = new BBank("B Bankasi", "123123123", "1234512345");
                bPos.connect("127.0.0.1");
                bPos.payment(price, cardNumber, expiryDate, cvc);
                break;
            default:
                System.out.println("Gecerli Banka giriniz.");
        }

        scanner.close();

    }
}
