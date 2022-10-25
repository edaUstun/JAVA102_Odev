package Java102.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Program Basladi.");

        int a = 9;
        int b = 20;
        int c;
        int[] arr = new int[2];

        // try : hatanin olusabilecegi alan - kisim
        try {
            System.out.println("Bolme Islemi Basladi");
            System.out.println(b/a);
            System.out.println("Bolme Islemi Bitti");
            c = scan.nextInt();
            arr[10] = 11;

        } catch (ArithmeticException e) {
            System.out.println("Aritmetik Hata Yakalandi.");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Array Hatasi Alindi.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bu ksim kesinlikle calisacak.");
        }

        System.out.println("Program Bitti.");

    }
}
